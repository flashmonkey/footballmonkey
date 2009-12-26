package com.footballmonkey.java.mvcs.service.operation;

import com.footballmonkey.java.utils.StringUtils;


public class DescriptionResultProcessor implements IResultProcessor {

	@Override
	public String processResult(String s) {
		String[] splitString = s.split("<description>");
		
		String preDescription = splitString[0];		

		splitString = splitString[1].split("</description>");

		String postDescription = splitString[1];
		
		String description = splitString[0];
		
		description = StringUtils.remove(description, "<BR>");
		description = StringUtils.remove(description, "<br>");
		
		StringBuilder builder = new StringBuilder();
		builder.append(preDescription);
		builder.append("<description>");
		builder.append(description);		
		builder.append("</description>");
		builder.append(postDescription);
		
		
		return builder.toString();
	}

}
