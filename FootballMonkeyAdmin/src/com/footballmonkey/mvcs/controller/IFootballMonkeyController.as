package com.footballmonkey.mvcs.controller
{
	import com.footballmonkey.mvcs.service.IStatsService;
	import com.joeberkovitz.moccasin.service.IOperation;
	
	public interface IFootballMonkeyController
	{
		function set statsService(value:IStatsService):void;
		
		function updateStats():IOperation;
	}
}