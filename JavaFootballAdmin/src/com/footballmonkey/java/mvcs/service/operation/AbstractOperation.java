package com.footballmonkey.java.mvcs.service.operation;

import java.util.ArrayList;

public abstract class AbstractOperation implements IOperation {

	private ArrayList<IOperationListener> listeners = new ArrayList<IOperationListener>();
	
	protected Object result;
	
	@Override
	public abstract void execute();
	
	public Object getResult() {
		return result;
	}
	
	@Override
	public void addListener(IOperationListener listener) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeListener(IOperationListener listener) {
		if (listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}

	public void handleComplete() {
		for (IOperationListener listener : listeners) {
			listener.operationComplete(this);
		}
	}
	
	public void handleFault() {
		for (IOperationListener listener : listeners) {
			listener.operationFault(this);
		}
	}
}
