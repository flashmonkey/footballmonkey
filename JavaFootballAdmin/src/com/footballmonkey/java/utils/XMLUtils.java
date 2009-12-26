package com.footballmonkey.java.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XMLUtils {
	
	private static TransformerFactory transformerFactory;
	
	private static Transformer transformer;
	
	private static DocumentBuilderFactory documentBuilderFactory;
	
	private static DocumentBuilder documentBuilder;
	
	public static Document createNewDocument(String rootNodeName) {
		DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			
			Element root = doc.createElement(rootNodeName);
			doc.appendChild(root);
			
			return doc;
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public static Document parseFile(String fileName) {
		System.out.println("Parsing XML file... " + fileName);

		if (documentBuilder == null) {
			refreshDocumentBuilder();
		}
		
		File sourceFile = new File(fileName);
		
		try {
			return documentBuilder.parse(sourceFile);
		} catch (SAXException e) {
			System.out.println("Wrong XML file structure: " + e.getMessage());
			return null;
		} catch (IOException e) {
			System.out.println("Could not read source file: " + e.getMessage());
		}

		return null;
	}	
	
	public static int countChildNodes(String fileName) {
		Document doc = parseFile(fileName);
		return doc.getFirstChild().getChildNodes().getLength();
	}
	
	public static String createPrintableString(Document doc) {
		String s = "";
		try {
			// set up a transformer
			TransformerFactory transfac = TransformerFactory.newInstance();
			Transformer trans = transfac.newTransformer();
			trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			trans.setOutputProperty(OutputKeys.INDENT, "yes");
	
			// create string from xml tree
			StringWriter sw = new StringWriter();
			StreamResult result = new StreamResult(sw);
			DOMSource source = new DOMSource(doc);
			trans.transform(source, result);
	
			s = sw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public static boolean save(Source source, Result result) {
		if (transformer == null) {
			refreshTransformer();
		}
		
		try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public static boolean save(Source source, File file) {
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("Error occured: " + e.getMessage());
			return false;
		}
		
		return save(source, new StreamResult(out));
	}
	
	public static boolean save(Source source, String location) {
		return save(source, FileUtils.resolvePath(location));		
	}
	
	public static boolean save(String fileName, Document doc) {				
		return save(new DOMSource(doc), fileName);
	}
	
	public static void refreshDocumentBuilderFactory() {
		documentBuilderFactory = DocumentBuilderFactory.newInstance();
	}
	
	public static void refreshDocumentBuilder() {
		if (documentBuilderFactory == null) {
			refreshDocumentBuilderFactory();
		}
		
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			System.out.println("Wrong parser configuration: " + e.getMessage());
		}
	}
	
	public static void refreshTransformerFactory() {
		transformerFactory = TransformerFactory.newInstance();
	}
	
	public static void refreshTransformer() {
		if (transformerFactory == null) {
			refreshTransformerFactory();
		}
		
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			System.out.println("Transformer configuration error: " + e.getMessage());
		}
	}
}
