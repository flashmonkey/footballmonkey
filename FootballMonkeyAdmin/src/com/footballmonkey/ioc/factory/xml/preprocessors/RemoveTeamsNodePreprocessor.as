package com.footballmonkey.ioc.factory.xml.preprocessors
{
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class RemoveTeamsNodePreprocessor implements IXMLObjectDefinitionsPreprocessor
	{
		public function RemoveTeamsNodePreprocessor()
		{
		}

		public function preprocess(xml:XML):XML
		{
			try
			{
				delete xml..teams;
			}
			catch (e:Error)
			{
				
			}
			
			return xml;
		}
		
	}
}