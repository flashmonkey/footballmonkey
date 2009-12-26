package com.footballmonkey.java.mvcs.service.operation;

import com.footballmonkey.java.mvcs.service.AFSService;

public class RetrieveAllStatisticsOperation extends OperationSequence {

	@Override
	public void execute() {
		
		addOperation(new RetrieveAFSStatisticsOperation(new AFSService()));
		
		super.execute();
	}
}
