package com.footballmonkey.mvcs.service
{
	import com.footballmonkey.mvcs.service.operation.IResultProcessor;
	import com.joeberkovitz.moccasin.service.XmlHttpOperation;
	
	import flash.events.Event;
	import flash.events.IOErrorEvent;
	import flash.events.SecurityErrorEvent;
	import flash.net.URLLoader;
	import flash.net.URLLoaderDataFormat;
	import flash.net.URLRequest;
	import flash.net.URLRequestMethod;

	public class XmlHttpGetOperation extends XmlHttpOperation
	{
		private var _resultProcessors:Array = [];
		
		public function XmlHttpGetOperation(url:String, data:*=null)
		{
			super(url, data);
		}
		
		public function addResultProcessor(processor:IResultProcessor):void 
		{
			_resultProcessors.push(processor);
		}
		
		override public function execute():void
        {        	
        	trace("Loading data from: " + url);
        	
            var request:URLRequest = new URLRequest(url);
            request.method = URLRequestMethod.GET;
                
            loader = new URLLoader();
            loader.dataFormat = URLLoaderDataFormat.TEXT;
            loader.addEventListener(Event.COMPLETE, handleResult);
            loader.addEventListener(IOErrorEvent.IO_ERROR, handleError);
            loader.addEventListener(SecurityErrorEvent.SECURITY_ERROR, handleError);
            loader.load(request);
            dispatchProgressSourceEvent(loader);
        }
        
        protected override function handleResult(e:Event):void
        {           	
        	var result:String = String(loader.data);
        	
        	for each (var processor:IResultProcessor in _resultProcessors)
        	{
        		result = processor.processResult(result);
        	}
        	
        	try
        	{
            	resultXml = new XML(<objects/>);
            	resultXml.appendChild(new XML(result));
         	}
         	catch (e:Error)
         	{
         		trace("ERROR: " + e + " "); 
           	}
           	finally
           	{
           		handleComplete(e);
           	}
        }
	}
}