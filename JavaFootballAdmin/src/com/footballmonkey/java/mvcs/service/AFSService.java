package com.footballmonkey.java.mvcs.service;

import com.footballmonkey.java.mvcs.service.operation.DescriptionResultProcessor;
import com.footballmonkey.java.mvcs.service.operation.HttpRequestOperation;
import com.footballmonkey.java.mvcs.service.operation.IOperation;
import com.footballmonkey.java.mvcs.service.operation.IResultProcessor;

public class AFSService implements IFootballStatisticsService {

	private String baseUrl = "http://11v11.com/api/";
	
	private String teamsToken = "teams";
	
	private String playerToken = "player";
	
	private String playersToken = "players";
	
	private String matchesToken = "matches";
	
	private String xmlAppendix = "/xml/true";
	
	@Override
	public IOperation getMatch(int matchID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IOperation getMatches() {
		return new HttpRequestOperation(baseUrl +  matchesToken + xmlAppendix);
	}

	@Override
	public IOperation getPlayer(int playerID) {
		return new HttpRequestOperation(baseUrl + playerToken + "/" + playerID + xmlAppendix, new IResultProcessor[]{new DescriptionResultProcessor()});
	}

	@Override
	public IOperation getPlayers() {
		return new HttpRequestOperation(baseUrl + playersToken + xmlAppendix);
	}

	@Override
	public IOperation getTeams() {
		return new HttpRequestOperation(baseUrl + teamsToken + xmlAppendix);
	}

}
