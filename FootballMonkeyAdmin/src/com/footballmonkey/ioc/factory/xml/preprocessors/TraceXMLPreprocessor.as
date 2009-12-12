package com.footballmonkey.ioc.factory.xml.preprocessors
{
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class TraceXMLPreprocessor implements IXMLObjectDefinitionsPreprocessor
	{
		public function TraceXMLPreprocessor()
		{
		}

		public function preprocess(xml:XML):XML
		{
			trace(xml);
			
			return xml;
		}
		
	}
}