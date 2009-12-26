package com.footballmonkey.java.utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

	public static File resolvePath(String location) {
		
		System.out.println("Trying to resolve a path to " + location);
		
		File file = new File(location);
		
		if (file.exists()) {
			return file;
		} else {
			System.out.println("File doesn't exists - trying to create it immediately");
			
			
			if (!createFile(file)) {
				System.out.println("File couldn't be created directly - need to create the path, too");
				String[] path = location.split("/");
				StringBuilder previousPath = new StringBuilder();
				boolean first = true;
				for (String f : path) {
					if (!first) {
						f = "/" + f;
					} else {
						first = false;
					}
					previousPath.append(f);
					
					File previousFile = new File(previousPath.toString());
					
					if (!previousFile.exists()) {
						createFile(previousFile);
					}
					
					//resolvePath(previousPath.toString());
				}
				
				return resolvePath(location);
			} else {
				return file;
			}
		} 
	}
	
	public static boolean createFile(File file) {
		boolean success = false;
		try {
			if (file.getPath().lastIndexOf(".") < 0) {
				success = file.mkdir();
			} else {
				success = file.createNewFile();
			}
		} catch (IOException e) {
			success = false;
		}
		
		return success;
	}
}
