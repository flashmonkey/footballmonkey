package com.footballmonkey.java.mvcs.service.operation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.footballmonkey.java.mvcs.service.IFootballStatisticsService;
import com.footballmonkey.java.utils.FileUtils;
import com.footballmonkey.java.utils.XMLUtils;

public class LoadPlayersOperation extends OperationSequence {

	private IFootballStatisticsService service;
	
	private List<IOperation> failedOperations;
	
	public LoadPlayersOperation(IFootballStatisticsService service) {
		this.service = service;
	}
	
	@Override
	public void execute() {
		Document document = XMLUtils.parseFile("data/players.xml");
		Element docElement = document.getDocumentElement();
		
		NodeList playerNodes = docElement.getElementsByTagName("player");
		
		System.out.println("there are " + playerNodes.getLength() + " players");
		
		failedOperations = new ArrayList<IOperation>();
		
		int lower = 0;
		int upper = playerNodes.getLength();
		
		
		for (int i = 0; i < playerNodes.getLength(); i++) {
			if (i > lower && i < upper) {	
				Element node = (Element)playerNodes.item(i);
				
				String id = node.getAttribute("id");
				
				String fileName = "data/players/" + id + ".xml";
				
				if (!new File(fileName).exists()) {
					addOperation(new SaveResultToFileOperation(service.getPlayer(Integer.parseInt(id)), FileUtils.resolvePath(fileName), failedOperations));
				}
			}
		}
		super.execute();
	}
	
	@Override 
	public void handleComplete() {
		Document document = XMLUtils.createNewDocument("failedRequests");
		Element documentElement = document.getDocumentElement();
		
		for (IOperation failedOperation : failedOperations) {
			Element node = document.createElement("failedOperation");
			node.setAttribute("url", ((HttpRequestOperation)failedOperation).getUrl());
			
			documentElement.appendChild(node);
		}
		
		XMLUtils.save("data/players/failedOperations.xml", document);
		
		super.handleComplete();
		
	}
}
