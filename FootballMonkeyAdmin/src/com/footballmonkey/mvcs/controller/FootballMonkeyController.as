package com.footballmonkey.mvcs.controller
{
	import com.footballmonkey.mvcs.service.IStatsService;
	import com.footballmonkey.mvcs.service.operation.UpdateStatsOperation;
	import com.joeberkovitz.moccasin.service.IOperation;

	public class FootballMonkeyController implements IFootballMonkeyController
	{
		private var _statsService:IStatsService;
		
		public function set statsService(value:IStatsService):void
		{
			_statsService = value;
		}
		
		public function FootballMonkeyController()
		{
		}	
		
		public function updateStats():IOperation
		{
			return new UpdateStatsOperation(_statsService);
		}
		
	}
}