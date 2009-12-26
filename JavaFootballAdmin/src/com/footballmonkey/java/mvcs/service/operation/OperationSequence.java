package com.footballmonkey.java.mvcs.service.operation;

import java.util.ArrayList;
import java.util.List;

public class OperationSequence extends AbstractOperation implements IOperationListener {

	private List<IOperation> pendingRequests = new ArrayList<IOperation>();
	
	private ArrayList<IOperation> completeRequests = new ArrayList<IOperation>();
	
	private boolean failOnFault = false;
	
	public OperationSequence() {
		
	}
	
	public void addOperation(IOperation operation) {
		pendingRequests.add(operation);
	}
	
	@Override
	public void execute() {
		nextOperation();
	}

	@Override
	public void operationComplete(IOperation operation) {
		//completeRequests.add(operation);
		System.out.println("Now There are " + pendingRequests.size() + " left to execute on " + this);
		nextOperation();		
	}
	
	public void nextOperation() {
		System.out.println("There are " + pendingRequests.size() + " left to execute on " + this);
		if (pendingRequests.size() > 0) {
			IOperation operation = pendingRequests.remove(0);
			operation.addListener(this);
			operation.execute();
		} else {
			System.out.println("Sequence " + this + " complete");
			handleComplete();
		}
	}

	@Override
	public void operationFault(IOperation operation) {
		if (failOnFault) {
			handleFault();
		} else {		
			nextOperation();
		}
	}

}
