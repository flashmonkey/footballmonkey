package com.footballmonkey.ioc.factory.xml.preprocessors
{
	import org.springextensions.actionscript.ioc.factory.xml.parser.IXMLObjectDefinitionsPreprocessor;

	public class PlayerDetailsPreprocessor implements IXMLObjectDefinitionsPreprocessor
	{
		public function PlayerDetailsPreprocessor()
		{
		}

		public function preprocess(xml:XML):XML
		{
	
	      	var nodes:XMLList = xml.player;
	      	trace("there are " + nodes.length() + " players details to capture");
	
	      	for (var i:int = 0; i < nodes.length(); i++) {
	      		
	        	var node:XML = nodes[i];
	     
	        	var playerXMLList:XMLList = xml..object.(@id == "__player" + node.@id);
	        	
	        	if (playerXMLList.length() > 0)
	        	{
	        		var playerXML:XML = playerXMLList[0];
	        
	        		playerXML.appendChild(<property name="name" value={node.name.text()}/>);	        
	        		playerXML.appendChild(<property name="description" value={node.description.text()}/>);
	        		
	        		playerXML.appendChild(<property name="details">
	        								<object id={"__player" + node.@id + "__details"} class="com.footballmonkey.mvcs.model.vo.PlayerDetails">
					                        	<property name="id" value={node.@id}/>
					                        	<property name="country" value={node..country.text()}/>
					                        	<property name="born" value={node..born.text()}/>
					                        	<property name="birthplace" value={node..birthplace.text()}/>
					                        	<property name="weight" value={node..weight.text()}/>
					                        	<property name="height" value={node..height.text()}/>
					                        	<property name="position" value={node..position.text()}/>
				                         	</object>
				                         	</property>);
				                         	
				    var clubHistoryXML:XML = <array/>;
				    var n:int = 0;
				    
				    for each (var period:XML in node.club_history.period)
				    {
				    	clubHistoryXML.appendChild(<object id={"__player" + node.@id + "__club" + (n++)} class="com.footballmonkey.mvcs.model.vo.ClubHistoryPeriod">
					    									   <property name="club" value={period.club.text()}/>
					    									   <property name="dateJoined" value={period.date_joined.text()}/>
					    									   <property name="dateLeft" value={period.date_left.text()}/>
					    									   <property name="trialist" value={period.trialist.text()}/>
				    									   </object>);
				    }
				    
				    playerXML.appendChild(<property name="clubHistory">{clubHistoryXML}</property>);
	        		
	        		var playerStatXML:XML = <array/>;
	        		n = 0;
	        		
	        		for each (var stat:XML in node.player_stats.stat)
	        		{
	        			playerStatXML.appendChild(<object id={"__player" + node.@id + "__stat" + (n++)} class="com.footballmonkey.mvcs.model.vo.PlayerStat">
					    									   <property name="competition" value={stat.competition.text()}/>
					    									   <property name="team" value={stat.team.text()}/>
					    									   <property name="period" value={stat.period.text()}/>
					    									   <property name="fullapps" value={stat.fullapps.text()}/>
					    									   <property name="subs" value={stat.subs.text()}/>
					    									   <property name="cleansheets" value={stat.cleansheets.text()}/>
					    									   <property name="goalsconceded" value={stat.goalsconceded.text()}/>
					    									   <property name="yellowcards" value={stat.yellowcards.text()}/>
					    									   <property name="redcards" value={stat.redcards.text()}/>
				    									   </object>);
	        		}
	        		
	        		playerXML.appendChild(<property name="playerStats">{playerStatXML}</property>);
	        		
	        		try
	        		{
	        			delete nodes[i];
	        			i--;
	        		}
	        		catch (e:Error)
	        		{
	        			
	        		}
	        	}
	       }
	       
	       return xml;
		}		
	}
}