package com.footballmonkey
{
	import com.footballmonkey.mvcs.controller.IFootballMonkeyController;
	import com.footballmonkey.mvcs.model.vo.Match;
	import com.footballmonkey.mvcs.model.vo.Player;
	import com.footballmonkey.mvcs.model.vo.Team;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	import flash.filesystem.File;
	
	import mx.controls.Button;
	import mx.core.WindowedApplication;
	import mx.events.FlexEvent;
	
	import nz.co.codec.flexorm.EntityManager;
	
	import org.springextensions.actionscript.context.support.XMLApplicationContext;

	public class Main extends WindowedApplication
	{
		private var _applicationContext:XMLApplicationContext;
		
		private var _controller:IFootballMonkeyController;
		
		public var loadContextFileButton:Button;
		
		private var _contextFile:File;
		
		private var _dataContext:XMLApplicationContext;
		
		private var em:EntityManager;
		
		public function Main()
		{
			super();
			
			addEventListener(FlexEvent.APPLICATION_COMPLETE, onApplicationComplete);
		}
		
		private function onApplicationComplete(e:FlexEvent):void 
		{
			removeEventListener(FlexEvent.APPLICATION_COMPLETE, onApplicationComplete);
			
			bindings();
			loadAppContext();
		}
		
		private function bindings():void 
		{
			loadContextFileButton.addEventListener(MouseEvent.CLICK, onLoadContextButtonClick);
		}
		
		private function loadAppContext():void 
		{
			_applicationContext = new XMLApplicationContext(File.applicationDirectory.nativePath + "/assets/application-context.xml");
			_applicationContext.addEventListener(Event.COMPLETE, onApplicationContextComplete);
			_applicationContext.load();
		}
		
		private function onApplicationContextComplete(e:Event):void 
		{
			_controller = IFootballMonkeyController(_applicationContext.getObject("controller"));
			
			em = EntityManager.instance;
			em.openSyncConnection("premiership.db");
			
			var player:Player = new Player();
			//player.id = 123;
			player.name = "pissarse";
			
			em.save(player);
			
			/*var op:IOperation = _controller.updateStats();
			op.addEventListener(Event.COMPLETE, onStatsUpdated);
			op.execute();*/
		}
		
		private function onStatsUpdated(e:Event):void 
		{
			
		}
		
		private function onLoadContextButtonClick(e:MouseEvent):void 
		{
			_contextFile = File.applicationStorageDirectory;
			_contextFile.addEventListener(Event.SELECT, onContextFileSelected);
			_contextFile.browseForOpen("Select a context file...");
		}
		
		private function onContextFileSelected(e:Event):void 
		{
			trace(_contextFile.url);
			
			_dataContext = new XMLApplicationContext(_contextFile.url);
			_dataContext.addEventListener(Event.COMPLETE, onDataContextComplete);
			_dataContext.load();
		}
		
		private function onDataContextComplete(e:Event):void 
		{
			trace("Data Context Loaded");
			
			em = EntityManager.instance;
			em.openSyncConnection("premiership.db");
			
			saveTeams();
			savePlayers();
			saveMatches();
		}
		
		private function saveTeams():void 
		{
			var teams:Array = _dataContext.getObjectNamesForType(Team);
			
			trace("saving " + teams.length + " teams");
			
			em.startTransaction();
			
			for each (var name:String in teams)
			{
				var team:Team = _dataContext.getObject(name);
				
				if (team.name != null)
				{
					trace("saving team " + team.name);
					em.save(team);
				}
			}
			
			em.endTransaction();
		}
		
		private function savePlayers():void
		{
			var players:Array = _dataContext.getObjectNamesForType(Player);
			
			trace("saving " + players.length + " players");
			
			em.startTransaction();
			
			for each (var name:String in players)
			{
				var player:Player = _dataContext.getObject(name);
				
				if (player.name != null)
				{
					trace("saving player " + player.name);
					em.save(player);
				}
			}
			
			em.endTransaction();
		}
		
		private function saveMatches():void 
		{
			var matches:Array = _dataContext.getObjectNamesForType(Match);
			
			trace("saving " + matches.length + " matches");
			
			em.startTransaction();
			
			for each (var name:String in matches)
			{
				var match:Match = _dataContext.getObject(name);
				
				if (match.hometeam && match.awayteam)
				{
					trace("saving match " + match.hometeam.name + " vs. " + match.awayteam.name);
					em.save(match);
				}
			}
			
			em.endTransaction();
		}
	}
}