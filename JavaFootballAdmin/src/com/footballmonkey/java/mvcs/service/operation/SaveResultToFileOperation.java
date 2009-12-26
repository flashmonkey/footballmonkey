package com.footballmonkey.java.mvcs.service.operation;

import java.io.File;
import java.io.StringReader;
import java.util.List;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import com.footballmonkey.java.utils.XMLUtils;

public class SaveResultToFileOperation extends AbstractOperation implements
		IOperationListener {

	private IOperation operation;

	private File file;
	
	private List<IOperation> failedOperations;
	
	public SaveResultToFileOperation(IOperation operation, File file, List<IOperation> failedOperations) {
		this.operation = operation;
		this.file = file;
		this.failedOperations = failedOperations;
	}

	@Override
	public void execute() {
		operation.addListener(this);
		operation.execute();
	}

	private void saveResult(IOperation operation) {
		String xml = (String) operation.getResult();
		StringReader reader = new StringReader(xml);

		Source source = new StreamSource(reader); 
		
		System.out.println("saving data to " + file + " " + file.getAbsolutePath());
		
		boolean success = XMLUtils.save(source, file);
		
		if (!success) {
			failedOperations.add(operation);
		}
		
		handleComplete();
	}

	@Override
	public void operationComplete(IOperation operation) {
		saveResult(operation);
	}

	@Override
	public void operationFault(IOperation operation) {
		failedOperations.add(operation);
		handleComplete();
	}

}
