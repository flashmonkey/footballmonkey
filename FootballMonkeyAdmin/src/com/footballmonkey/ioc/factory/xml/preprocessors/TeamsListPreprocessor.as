package com.footballmonkey.ioc.factory.xml.preprocessors
{
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class TeamsListPreprocessor implements IXMLObjectDefinitionsPreprocessor
	{
		public function TeamsListPreprocessor()
		{
		}

		public function preprocess(xml:XML):XML
		{
	      	var nodes:XMLList = xml..teams.team;
	      	
			trace("There are " + nodes.length() + " team nodes");
			
	      	for (var i:int = 0; i < nodes.length(); i++) {
	        	var node:XML = nodes[i];
	        	
	        	var playersXML:XML = <array/>;
	        	var n:int = 0;
	        	
	        	for each (var player:XML in node.players.player)
	        	{	        	
	        		playersXML.appendChild(<ref>{"__player" + player.@id}</ref>);
	        	}
	        	
	        	xml.appendChild(<object id={"__team" + node.@id} class="com.footballmonkey.mvcs.model.vo.Team">
			                        	<property name="id" value={node.@id}/>
			                        	<property name="name" value={node.name.text()}/>
			                        	<property name="players">{playersXML}</property>
			                        </object>);
	       }
	      
	       return xml;
		}
		
	}
}