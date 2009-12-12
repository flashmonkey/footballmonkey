package com.footballmonkey.mvcs.service
{
	import com.joeberkovitz.moccasin.service.IOperation;
	
	public interface IStatsService
	{
		function loadTeams():IOperation;
		
		function loadPlayers():IOperation;
		
		function loadPlayer(playerID:int):IOperation;
		
		function loadMatches():IOperation;
		
		function loadMatch(matchID:int):IOperation;
	}
}