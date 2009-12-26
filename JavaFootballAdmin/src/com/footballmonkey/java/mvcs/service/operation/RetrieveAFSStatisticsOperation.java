package com.footballmonkey.java.mvcs.service.operation;

import com.footballmonkey.java.mvcs.service.IFootballStatisticsService;
import com.footballmonkey.java.utils.FileUtils;

public class RetrieveAFSStatisticsOperation extends OperationSequence {

	private IFootballStatisticsService service;
	
	public RetrieveAFSStatisticsOperation(IFootballStatisticsService service) {
		this.service = service;
	}
	
	@Override 
	public void execute() {
		
		//addOperation(new SaveResultToFileOperation(service.getTeams(), FileUtils.resolvePath("data/teams.xml")));
		//addOperation(new SaveResultToFileOperation(service.getPlayers(), FileUtils.resolvePath("data/players.xml")));
		//addOperation(new SaveResultToFileOperation(service.getMatches(), FileUtils.resolvePath("data/matches.xml")));	
		
		addOperation(new LoadPlayersOperation(service));
		
		super.execute();
	}
}
