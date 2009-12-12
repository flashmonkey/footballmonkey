package com.footballmonkey.mvcs.service.operation
{
	import com.footballmonkey.mvcs.service.IStatsService;
	import com.footballmonkey.util.ArrayUtils;
	
	import flash.events.Event;
	import flash.filesystem.File;

	public class LoadPlayersDataOperation extends LoadFromXMLOperation
	{
		private var _service:IStatsService;
		
		private var _playersToLoad:Array = [];
		
		private var _bannedPlayers:Array = ["19461", "4528", "3837", "139", "2677", "8325", "1865", "3801", "3762", "16263", "3778", "1998", "7758", "14905", "32123", "12812", "31191", "1128", "5254", "2368", "33652", "11469", "30624", "26012", "28228", "2748", "26471", "3987", "10082", "17029", "7384", "1870", "19126", "11768", "4256", "4928", "1368", "7264", "6487", "15738", "2000", "19704"];
		
		public function LoadPlayersDataOperation(file:File, service:IStatsService)
		{
			super(file);
			
			_service = service;
		}
		
		protected override function handleData(data:*):void 
		{
			var xml:XML = new XML(data)
			
			var sequence:OperationSequence = new OperationSequence();
						
			var ignored:int = 0;
						
			for each (var player:XML in xml..player)
			{
				if (!ArrayUtils.contains(_playersToLoad, player.@id) && 
					!fileExists(player.@id) &&
					!isBannedPlayer(player.@id))
				{
					_playersToLoad.push(player.@id);
					sequence.addOperation(new SaveResultOperation(_service.loadPlayer(player.@id), File.applicationStorageDirectory.resolvePath("players/" + player.@id + ".xml")));
				}
				else
				{
					ignored++;
				}
			}
			
			trace("Loading " + _playersToLoad.length + " player files");
			trace("Ignoring " + ignored + " players either already loaded, banned or duplicated");
			
			sequence.addEventListener(Event.COMPLETE, onPlayersDataLoaded);
			sequence.execute();
		}
		
		private function fileExists(id:String):Boolean 
		{
			return File.applicationStorageDirectory.resolvePath("players/" + id + ".xml").exists;
		}
		
		private function isBannedPlayer(id:String):Boolean 
		{
			return ArrayUtils.contains(_bannedPlayers, id);
		}
		
		private function onPlayersDataLoaded(e:Event):void 
		{
			handleComplete(new Event(Event.COMPLETE));
		}
	}
}