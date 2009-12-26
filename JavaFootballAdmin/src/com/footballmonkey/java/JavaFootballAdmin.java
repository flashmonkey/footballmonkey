package com.footballmonkey.java;

import com.footballmonkey.java.mvcs.service.operation.IOperation;
import com.footballmonkey.java.mvcs.service.operation.IOperationListener;
import com.footballmonkey.java.mvcs.service.operation.RetrieveAllStatisticsOperation;


public class JavaFootballAdmin implements IOperationListener{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new JavaFootballAdmin().retrieveTeams();
	}

	public void retrieveTeams() {
		System.out.println("retrieving teams");
		
		IOperation operation = new RetrieveAllStatisticsOperation();
		operation.addListener(this);
		operation.execute();
	}

	@Override
	public void operationComplete(IOperation operation) {
		String result = (String)operation.getResult();
		
		System.out.println("RESULT\n" + result);
	}

	@Override
	public void operationFault(IOperation operation) {
		// TODO Auto-generated method stub
		
	}
}
