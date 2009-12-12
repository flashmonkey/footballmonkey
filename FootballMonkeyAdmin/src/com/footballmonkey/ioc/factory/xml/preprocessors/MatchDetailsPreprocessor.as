package com.footballmonkey.ioc.factory.xml.preprocessors
{
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class MatchDetailsPreprocessor implements IXMLObjectDefinitionsPreprocessor
	{
		public function MatchDetailsPreprocessor()
		{
		}

		public function preprocess(xml:XML):XML
		{
			var nodes:XMLList = xml.descendants("match");
	
			trace("There are " + nodes.length() + " match nodes to parse");
	
	      	for (var i:int = 0; i < nodes.length(); i++) {
	        	var node:XML = nodes[i];
	        	
	        	var homePlayersXML:XML = <array/>;
	        	
	        	for each (var player:XML in node.lineups.home_players.player)
	        	{
	        		homePlayersXML.appendChild(<ref>{"__player" + player.@id}</ref>);
	        	}
	        	
	        	var awayPlayersXML:XML = <array/>;
	        	
	        	for each (player in node.lineups.away_players.player)
	        	{
	        		awayPlayersXML.appendChild(<ref>{"__player" + player.@id}</ref>);
	        	}
	        					
	        	xml.appendChild(<object id={"__match" + node.@id} class="com.footballmonkey.mvcs.model.vo.Match">
	        						<property name="hometeam" ref={"__team" + node.home_team.@id}/>
	        						<property name="awayteam" ref={"__team" + node.away_team.@id}/>
	        						<property name="matchdate" value={node.match_date.text()}/>
	        						<property name="score" value={node.score.text()}/>
	        						<property name="referee" value={node.referee.text()}/>
	        						<property name="venue" value={node.venue.text()}/>
	        						<property name="attendance" value={node.attendance.text()}/>
	        						<property name="homeplayers">{homePlayersXML}</property>
	        						<property name="awayplayers">{awayPlayersXML}</property>
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