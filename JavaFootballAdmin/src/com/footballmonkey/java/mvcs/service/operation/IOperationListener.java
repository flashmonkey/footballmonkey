package com.footballmonkey.java.mvcs.service.operation;

public interface IOperationListener {

	void operationComplete(IOperation operation);
	
	void operationFault(IOperation operation);
}
