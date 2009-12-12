package com.footballmonkey.mvcs.service.operation
{
	import com.footballmonkey.mvcs.service.IStatsService;
	import com.joeberkovitz.moccasin.service.AbstractOperation;
	
	import flash.events.Event;

	public class UpdateStatsOperation extends AbstractOperation
	{
		private var _dataService:IStatsService;
		
		public function UpdateStatsOperation(dataService:IStatsService)
		{
			super();
			
			_dataService = dataService;
		}
		
		public override function execute():void
		{
			trace("updating stats");
			
			var sequence:OperationSequence = new OperationSequence();
			
			//sequence.addOperation(new RetrieveStatsToFilesOperation(_dataService));
			sequence.addOperation(new GenerateApplicationContextOperation());
			
			sequence.addEventListener(Event.COMPLETE, onRetrievalComplete);
			sequence.execute();
		}
		
		private function onRetrievalComplete(e:Event):void 
		{
			trace("Retrieval Complete");
		}
	}
}