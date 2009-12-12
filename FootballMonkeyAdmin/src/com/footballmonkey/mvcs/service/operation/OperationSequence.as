package com.footballmonkey.mvcs.service.operation
{
	import com.joeberkovitz.moccasin.service.AbstractOperation;
	import com.joeberkovitz.moccasin.service.IOperation;
	import flash.events.Event;
	import com.joeberkovitz.moccasin.event.OperationFaultEvent;
	import flash.events.ErrorEvent;

	public class OperationSequence extends AbstractOperation
	{
		protected var _pendingOperations:Array = [];
		
		protected var _completedOperations:Array = [];
		
		public function OperationSequence()
		{
			super();
		}
		
		public function addOperation(operation:IOperation):void 
		{
			_pendingOperations.push(operation);
		}
		
		public override function execute():void
		{
			var operation:IOperation = _pendingOperations.shift();
			
			if (operation)
			{
				operation.addEventListener(Event.COMPLETE, onOperationComplete);
				operation.addEventListener(OperationFaultEvent.FAULT, onOperationFault);
				operation.execute();
			}
			else
			{
				handleComplete(new Event(Event.COMPLETE));
			}
		}
			
		protected function onOperationComplete(e:Event):void 
		{
			_completedOperations.push(e.target);
			
			execute();
		}
		
		protected function onOperationFault(e:Event):void 
		{
			handleError(new ErrorEvent(ErrorEvent.ERROR));
		}
	}
}