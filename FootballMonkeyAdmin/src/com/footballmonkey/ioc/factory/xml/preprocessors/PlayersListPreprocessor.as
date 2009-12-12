package com.footballmonkey.ioc.factory.xml.preprocessors
{
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class PlayersListPreprocessor implements IXMLObjectDefinitionsPreprocessor
	{
		public function PlayersListPreprocessor()
		{
		}

		public function preprocess(xml:XML):XML
		{	/*	
			// get the xml's default namespace
	      	var defaultNameSpace:Namespace = xml.namespace("");
	      	// and set it as the default namespace for all XML objects in the scope of this method
	      	// if there is one
	      	if (defaultNameSpace) {
	        	default xml namespace = defaultNameSpace;
	      	}*/
	
	      	//var nodes:XMLList = xml.descendants("player");
	      	
	      	var nodes:XMLList = xml..players.player;
			trace("There are " + nodes.length() + " player nodes");
			
	      	for (var i:int = 0; i < nodes.length(); i++) {
	      		
	        	var node:XML = nodes[i];
		        	
	        	xml.appendChild(<object id={"__player" + node.@id} class="com.footballmonkey.mvcs.model.vo.Player">
			                        	<property name="id" value={node.@id}/>
			                        </object>);
                
                // clean up
		        try {
		          // delete the node
		          delete nodes[i];
		          // and correct the index
		          i--;
		        }
		        catch (e:Error) {
		          // deleting the node failed.
		        }
	       }
	       
	       return xml;
		}
	}
}