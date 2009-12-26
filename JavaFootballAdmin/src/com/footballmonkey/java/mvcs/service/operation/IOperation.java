package com.footballmonkey.java.mvcs.service.operation;

public interface IOperation {

	void execute();
	
	Object getResult();
	
	void addListener(IOperationListener listener);
	
	void removeListener(IOperationListener listener);
}
