package com.footballmonkey.java.mvcs.service.operation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class HttpRequestOperation extends AbstractOperation {

	private String url;
	
	private IResultProcessor[] processors;
	
	public HttpRequestOperation(String url) {
		this.url = url;
		this.processors = new IResultProcessor[0];
	}
	
	public HttpRequestOperation(String url, IResultProcessor[] processors) {
		this.url = url;
		this.processors = processors;
	}
	
	@Override
	public void execute() {
		try {
			System.out.println("Requesting result from " + url);
			URL u = new URL(url);
			HttpURLConnection uc = (HttpURLConnection) u.openConnection();
			uc.setDoOutput(true);
			uc.setDoInput(true);
			uc.setUseCaches(false);
			uc.setRequestMethod("GET");
			uc.setReadTimeout(20000);
			uc.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
			uc.connect();
			DataOutputStream out = new DataOutputStream(uc.getOutputStream());
			out.write(out.size());

			DataInputStream in = new DataInputStream(uc.getInputStream());
			String response = IOUtils.toString(in, "UTF-8");
			
			if (response.indexOf("<?xml") < 0) {
				handleFault();
			} else {			
				System.out.println("Processing");
				for (IResultProcessor processor : processors) {
					response = processor.processResult(response);
				}
				
				result = response;
				
				//System.out.println("read result:\n" + result);
				handleComplete();
			}
			
		} catch (Exception e) {
			System.out.println("FAILED!\n " + e.getMessage());
			handleFault();
		}
	}

	public String getUrl() {
		return url;
	}
}
