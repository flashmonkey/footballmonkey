package com.footballmonkey.java.mvcs.service;

import com.footballmonkey.java.mvcs.service.operation.IOperation;

public interface IFootballStatisticsService {

	IOperation getTeams();
	
	IOperation getPlayers();
	
	IOperation getPlayer(int playerID);
	
	IOperation getMatches();
	
	IOperation getMatch(int matchID);
}
