package com.footballmonkey.ioc.factory.xml.preprocessors
{
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class CreateObjectsNodePreprocessor implements IXMLObjectDefinitionsPreprocessor
	{
		public function CreateObjectsNodePreprocessor()
		{
		}

		public function preprocess(xml:XML):XML
		{
			var springXML:XML = new XML(<objects/>);
			springXML.appendChild(xml);
			
			return springXML;
		}
		
	}
}