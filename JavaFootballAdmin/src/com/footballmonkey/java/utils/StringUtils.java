package com.footballmonkey.java.utils;

public class StringUtils {

	public static String remove(String src, String token) {
		String[] split = src.split(token);
		
		StringBuilder builder = new StringBuilder();
		
		for (String s : split) {
			builder.append(s);
		}
		
		return builder.toString();
	}
}
