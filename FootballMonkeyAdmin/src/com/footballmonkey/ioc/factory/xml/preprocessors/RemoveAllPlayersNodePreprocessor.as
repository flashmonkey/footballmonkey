package com.footballmonkey.ioc.factory.xml.preprocessors
{
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class RemoveAllPlayersNodePreprocessor implements IXMLObjectDefinitionsPreprocessor
	{
		public function RemoveAllPlayersNodePreprocessor()
		{
		}

		public function preprocess(xml:XML):XML
		{
			try
			{
				delete xml.allPlayers;
			}
			catch (e:Error)
			{
				
			}

			return xml;
		}
		
	}
}