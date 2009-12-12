package com.footballmonkey.mvcs.service.operation
{
	import com.joeberkovitz.moccasin.service.AbstractOperation;
	
	import flash.events.Event;
	import flash.filesystem.File;
	import flash.net.URLLoader;
	import flash.net.URLRequest;
	
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class ProcessXMLOperation extends AbstractOperation
	{
		protected var _processors:Array = [];
		
		protected var _url:String;
		
		
		
		public function ProcessXMLOperation(url:String, file:File)
		{
			super();
			
			_url = url;
		}
		
		public function addProcessor(processor:IXMLObjectDefinitionsPreprocessor):void 
		{
			_processors.push(processor);
		}
		
		public override function execute():void
		{
			var request:URLRequest = new URLRequest(_url);
			var loader:URLLoader = new URLLoader();
			loader.addEventListener(Event.COMPLETE, onXMLLoaded);
			
			loader.load(request);
		}
		
		protected function onXMLLoaded(e:Event):void 
		{
			var loader:URLLoader = URLLoader(e.target);
			var xml:XML = new XML(loader.data);
			
			for each (var processor:IXMLObjectDefinitionsPreprocessor in _processors)
			{
				xml = processor.preprocess(xml);
			}
			
			
		}
	}
}