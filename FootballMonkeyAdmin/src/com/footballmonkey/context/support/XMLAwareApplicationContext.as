package com.footballmonkey.context.support
{
	import flash.errors.IOError;
	import flash.events.Event;
	import flash.events.IOErrorEvent;
	import flash.filesystem.File;
	import flash.filesystem.FileMode;
	import flash.filesystem.FileStream;
	import flash.net.URLLoader;
	import flash.net.URLRequest;
	import flash.utils.ByteArray;
	
	import org.as3commons.lang.IllegalArgumentError;
	import org.as3commons.lang.IllegalStateError;
	import org.as3commons.logging.ILogger;
	import org.as3commons.logging.LoggerFactory;
	import org.springextensions.actionscript.context.IApplicationContext;
	import org.springextensions.actionscript.context.IConfigurableApplicationContext;
	import org.springextensions.actionscript.context.support.AbstractApplicationContext;
	import org.springextensions.actionscript.ioc.factory.xml.INamespaceHandler;
	import org.springextensions.actionscript.ioc.factory.xml.parser.support.XMLObjectDefinitionsParser;

	public class XMLAwareApplicationContext extends AbstractApplicationContext implements IConfigurableApplicationContext
	{
		private static var logger:ILogger = LoggerFactory.getClassLogger(XMLAwareApplicationContext);

		/**
		 * Contains the parser of the XML definitions. The instance is created in the constructor
		 * if it does not exist already.
		 * @default an instance of XMLObjectDefinitionsParser
		 */
		public var parser:XMLObjectDefinitionsParser;

		private var _xml:XML;

		private var _loadingConfig:Boolean;

		private var _loader:URLLoader;

		protected var currentConfigLocation:String = "";

		//private var _currentProperties:Properties;

		//private var _currentPropertyInfo:PropertiesInfo;

		//private var _propertiesQueue:Array /* of PropertiesInfo */ = [];

		// --------------------------------------------------------------------
		//
		// Constructor
		//
		// --------------------------------------------------------------------

		/**
		 * Creates a new XMLApplicationContext
		 */
		public function XMLAwareApplicationContext(source:* = null, parent:IApplicationContext = null) {
			super(parent);
			initXMLObjectFactory(source);
		}

		/**
		 * Initializes the <code>XMLObjectFactoryInit</code> instance
		 */
		protected function initXMLObjectFactory(source:*):void {
			if (source is String) {
				_configLocations.push(source);
			} else if (source is Array) {
				_configLocations = _configLocations.concat(source);
			} else if (source) {
				throw new IllegalArgumentError("XMLObjectFactory can only be constructed using an a String or an Array");
			}

			// create a parser if we don't have on
			if (!parser) {
				parser = new XMLObjectDefinitionsParser(this);
			}
		}

		/**
		 * Adds a namespace handler to the parser of this application context.
		 */
		public function addNamespaceHandler(handler:INamespaceHandler):void {
			parser.addNamespaceHandler(handler);
		}

		// ====================================================================
		// IXMLObjectFactory implementation
		// ====================================================================

		private var _configLocations:Array /* of String */ = [];

		/**
		 * @inheritDoc
		 */
		public function addConfigLocation(configLocation:String):void {
			_configLocations.push(configLocation);
		}

		/**
		 * @inheritDoc
		 */
		public function get configLocations():Array {
			return _configLocations;
		}

		/**
		 * This method will internally do the following:
		 * <ul>
		 * <li>Load all configuration entries (if any)</li>
		 * <li>Load all imports (if any)</li>
		 * <li>Load all property files (if any)</li>
		 * <li>Give the result to the XMLObjectDefinitionsParser</li>
		 * </ul>
		 * @see org.springextensions.actionscript.ioc.factory.xml.parser.support.XMLObjectDefinitionsParser XMLObjectDefinitionsParser
		 * @inheritDoc
		 */
		override public function load():void {
			super.load();

			// We only need one loader. Browser restrictions allow us to only have a
			// maximum of 2 threads to the server. It is proper however to only use
			// one at a time.
			_loader = new URLLoader();
			_loader.addEventListener(Event.COMPLETE, loader_completeHandler);
			_loader.addEventListener(IOErrorEvent.IO_ERROR, ioErrorHandler);

			var noConfigLocations:Boolean = (_configLocations.length == 0);
			var noXML:Boolean = (_xml == null);

			if (noConfigLocations && noXML) {
				throw new IllegalStateError("An XMLObjectFactory can only be loaded when a config location has been set or XML data was added to it.");
			} else {
				logger.debug("Loading object definitions");
				loadNextConfigLocation();
			}
		}

		/**
		 * @inheritDoc
		 */
		public function addConfig(config:XML):void {
			// If we are not retrieving the xml using a loader, we should reset
			// the _currentConfigLocation. When using the loader the _loadingConfig
			// flag is set to true and the location will not be reset.

			// The _currentConfigLocation is used in the _addImportLocationsIfAny and
			// _addPropertyLocationsIfAny methods.
			if (!_loadingConfig) {
				currentConfigLocation = "";
			}

			_mergeXML(config);

			// check if there are any xml or properties file references in the given xml data
			addImportLocationsIfAny(config);
			//addPropertyLocationsIfAny(config);
		}

		/**
		 * @inheritDoc
		 */
		public function addEmbeddedConfig(config:Class):void {
			var configInstance:ByteArray = new config();
			var configXML:XML = new XML(configInstance.readUTFBytes(configInstance.length));
			addConfig(configXML);
		}

		// ====================================================================

		/**
		 * Will load a configLocation
		 */
		protected function loadConfigLocation(configLocation:String):void {
			logger.info("Loading XML object definitions from [{0}]", configLocation);

			currentConfigLocation = configLocation;
			_loadingConfig = true;

			// add a pseudo random number to avoid caching
			//configLocation += ("?" + Math.round(Math.random() * 1000000));

			var request:URLRequest = new URLRequest(configLocation);

			_loader.load(request);
		}


		private function _mergeXML(xml:XML):void {
			if (_xml) {
				var childNodes:XMLList = xml.children();
				_xml.appendChild(childNodes);
			} else {
				_xml = xml;
			}
		}

		/**
		 * Returns the base url of the file this loading is loading.
		 */
		protected function getBaseURL(url:String):String {
			var lastSlashIndex:int = url.lastIndexOf("/");
			return (lastSlashIndex == -1) ? "" : url.substr(0, lastSlashIndex + 1);
		}

		/**
		 * Will grab the xml and add it as config
		 */
		private function loader_completeHandler(event:Event):void {
			// if the loading is done, we need to check if the xml contains
			// import or property tags
			// if it does, we first load these

			// TODO catch malformed xml
			var xml:XML = new XML(_loader.data);

			addConfig(xml);

			_loadingConfig = false;

			loadNextConfigLocation();
		}

		/**
		 * Checks if the given xml data contains any <import> tags. If any are found,
		 * their corresponding xml file is added to the load queue.
		 */
		protected function addImportLocationsIfAny(xml:XML):void {
			// TODO why does this not work?
			//var importNodes:XMLList = xml.descendants("import").(attribute("file") != undefined);

			for each (var node:XML in xml.children()) {
				var nodeName:QName = node.name() as QName;

				if (nodeName && (nodeName.localName == "import")) {
					var importLocation:String = getBaseURL(currentConfigLocation) + node.@file.toString();
					addConfigLocation(importLocation);
				}
			}
		}

		/**
		 * Parses the xml.
		 */
		protected function parse():void {
			parser.parse(_xml);
			dispatchEvent(new Event(Event.COMPLETE));
			//loadComplete();
		}

		/**
		 * Checks if the given xml data contains any <property> tags. If any are found,
		 * the information is added to a queue for later loading.
		 */
		/*private function addPropertyLocationsIfAny(xml:XML):void {
			// select all property nodes directly under the <objects/> element that have a file attribute
			var propertyNodes:XMLList = xml.property.(attribute("file") != undefined);
			var propertiesInfo:PropertiesInfo;

			for each (var node:XML in propertyNodes) {
				propertiesInfo = new PropertiesInfo();
				propertiesInfo.properties = new Properties();
				propertiesInfo.location = getBaseURL(currentConfigLocation) + node.@file.toString();
				propertiesInfo.required = (node.@required == undefined) ? true : String(node.@required.toString()).toLowerCase() == "true";
				propertiesInfo.preventCache = (node.attribute("prevent-cache").length() == 0) ? true : String(node.attribute("prevent-cache").toString()).toLowerCase() == "true";
				_propertiesQueue.push(propertiesInfo);
				logger.debug("Added external properties file '{0}' to load queue.", propertiesInfo);
			}

			if (!propertiesInfo) {
				logger.debug("No external properties file reference found.");
			}
		}*/

		/**
		 * If there are any config locations left, the next will be loaded.
		 */
		private function loadNextConfigLocation():void {
			// load the next config location if we have one
			if (_configLocations.length > 0) {
				var nextConfigLocation:String = String(_configLocations.shift());
				loadConfigLocation(nextConfigLocation);
			} else {
				cleanupLoader();
				_loader = null;
				parse();
			}
		}

		/**
		 * If there are any properties left to be loaded, the next will be loaded.
		 */
		/*private function loadNextProperties():void {
			if (_propertiesQueue.length > 0) {
				var propertyInfo:PropertiesInfo = PropertiesInfo(_propertiesQueue.shift());

				var loaderProperties:Properties = propertyInfo.properties;
				loaderProperties.addEventListener(Event.COMPLETE, properties_completeHandler);
				loaderProperties.addEventListener(IOErrorEvent.IO_ERROR, ioErrorHandler);

				//save a reference to prevent garbage collection
				_currentProperties = loaderProperties;
				_currentPropertyInfo = propertyInfo;

				logger.info("Loading properties file from [{0}]", propertyInfo.location);

				loaderProperties.load(propertyInfo.location, _loader, propertyInfo.preventCache);
			} else {
				_loader = null;
				parse();
			}
		}*/

		/*private function properties_completeHandler(event:Event):void {
			properties.merge(_currentProperties);
			cleanupCurrentProperties();
			loadNextProperties();
		}*/

		/**
		 * Removes the reference to the currentProperties, it make it available for garbage collection.
		 */
		/*private function cleanupCurrentProperties():void {
			if (_currentProperties) {
				_currentProperties.removeEventListener(Event.COMPLETE, properties_completeHandler);
				_currentProperties.removeEventListener(IOErrorEvent.IO_ERROR, ioErrorHandler);
			}

			_currentProperties = null;
			_currentPropertyInfo = null;
		}*/

		/**
		 * Will throw an error (just like the Flash player core classes) if
		 * no listener has been specified.
		 *
		 * @param event The IOErrorEvent
		 */
		private function ioErrorHandler(event:IOErrorEvent):void {
			// Don't throw an error if the IOErrorEvent was triggered
			// while trying to load a non-required properties file.
			var throwUnhandledIOError:Boolean = true;
			var shouldLoadNextProperties:Boolean = false;

			/*if (_currentPropertyInfo) {
				throwUnhandledIOError = _currentPropertyInfo.required;
				cleanupCurrentProperties();

				// raise flag to load next properties, if we don't throw an error
				if (!throwUnhandledIOError) {
					shouldLoadNextProperties = true;
				}
			}*/

			if (throwUnhandledIOError) {
				_loader = null;
				if (hasEventListener(event.type)) {
					dispatchEvent(event);
				} else {
					throw new IOError("Unhandled ioError: " + event.text);
				}
			} else {
				/*if (shouldLoadNextProperties) {
					loadNextProperties();
				}*/
			}
		}

		/**
		 * If the <code>_loader</code> variable is not null the <code>onLoaderComplete</code>
		 * and <code>onIOError</code> event handlers are removed.
		 */
		protected function cleanupLoader():void {
			if (_loader) {
				if (_loader.willTrigger(Event.COMPLETE)) {
					_loader.removeEventListener(Event.COMPLETE, loader_completeHandler);
				}
				if (_loader.willTrigger(IOErrorEvent.IO_ERROR)) {
					_loader.removeEventListener(IOErrorEvent.IO_ERROR, ioErrorHandler);
				}
			}
		}
		
		public function saveXML(file:File):void 
		{
			var out:FileStream = new FileStream();
            out.open(file, FileMode.WRITE);

            out.writeUTFBytes(_xml.toXMLString());
            out.writeUTFBytes("\n");

            out.close();
		}

	}
}