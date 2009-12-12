package com.footballmonkey.mvcs.service.operation
{
	import com.joeberkovitz.moccasin.service.IOperation;
	import com.joeberkovitz.moccasin.service.XmlFileWriteOperation;
	
	import flash.events.Event;
	import flash.filesystem.File;
	import com.joeberkovitz.moccasin.service.AbstractOperation;
	import flash.filesystem.FileStream;
	import flash.filesystem.FileMode;

	public class SaveResultOperation extends AbstractOperation
	{
		protected var _operation:IOperation;
		
		protected var _file:File;
				
		public function SaveResultOperation(operation:IOperation, file:File)
		{
			super();
			
			_file = file;
			_operation = operation;
		}
		
		public override function execute():void
		{
			_operation.addEventListener(Event.COMPLETE, onOperationComplete);
			_operation.execute();
		}
		
		protected function onOperationComplete(e:Event):void 
		{
			var data:* = _operation.result;
			
			var out:FileStream = new FileStream();
            out.open(_file, FileMode.WRITE);
            
            if (data is XML)
            {
                out.writeUTFBytes((data as XML).toXMLString());
                out.writeUTFBytes("\n");
            }
            else if (data is String)
            {
                out.writeUTFBytes(data);
            }

            out.close();
            dispatchEvent(new Event(Event.COMPLETE));
		}
	}
}