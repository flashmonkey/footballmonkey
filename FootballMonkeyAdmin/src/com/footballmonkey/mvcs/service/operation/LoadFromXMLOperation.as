package com.footballmonkey.mvcs.service.operation
{
	import com.joeberkovitz.moccasin.service.AbstractOperation;
	import flash.filesystem.File;
	import flash.filesystem.FileStream;
	import flash.filesystem.FileMode;
	import flash.events.Event;
	import flash.utils.ByteArray;
	import flash.net.URLLoader;
	import flash.net.URLRequest;
	import flash.events.IOErrorEvent;

	public class LoadFromXMLOperation extends AbstractOperation
	{
		private var _file:File;
		
		public function LoadFromXMLOperation(file:File)
		{
			super();
			
			_file = file;
		}
		
		public override function execute():void
		{
			trace("loading file: " + _file.nativePath);
			
			var request:URLRequest = new URLRequest(_file.url);
			var urlLoader:URLLoader = new URLLoader(request);		
			urlLoader.addEventListener(Event.COMPLETE, onFileLoadComplete);
			urlLoader.addEventListener(IOErrorEvent.IO_ERROR, onIOError);
		}
		
		protected function onFileLoadComplete(e:Event):void 
		{			
			var loader:URLLoader = URLLoader(e.target);
			
			handleData(loader.data);
		}
		
		protected function onIOError(e:IOErrorEvent):void 
		{
			trace(e.text);
		}
		
		protected function handleData(data:*):void 
		{
			
		}
	}
}