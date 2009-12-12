package com.footballmonkey.mvcs.service.operation
{
	import com.footballmonkey.mvcs.service.IStatsService;
	import com.footballmonkey.util.ArrayUtils;
	
	import flash.events.Event;
	import flash.filesystem.File;

	public class LoadMatchesDataOperation extends LoadFromXMLOperation
	{
		private var _service:IStatsService;
		
		private var _matchesToLoad:Array = [];
		
		private var _bannedMatches:Array = [];

		public function LoadMatchesDataOperation(file:File, service:IStatsService)
		{
			super(file);
			
			_service = service;
		}
		
		protected override function handleData(data:*):void 
		{
			var xml:XML = new XML(data)
			
			var sequence:OperationSequence = new OperationSequence();
						
			var ignored:int = 0;
						
			for each (var match:XML in xml..match)
			{
				if (!ArrayUtils.contains(_matchesToLoad, match.@id) && 
					!fileExists(match.@id) &&
					!isBannedPlayer(match.@id))
				{
					_matchesToLoad.push(match.@id);
					sequence.addOperation(new SaveResultOperation(_service.loadMatch(match.@id), File.applicationStorageDirectory.resolvePath("matches/" + match.@id + ".xml")));
				}
				else
				{
					ignored++;
				}
			}
			
			trace("Loading " + _matchesToLoad.length + " match files");
			trace("Ignoring " + ignored + " matches either already loaded, banned or duplicated");
			
			sequence.addEventListener(Event.COMPLETE, onMatchesDataLoaded);
			sequence.execute();
		}
		
		private function fileExists(id:String):Boolean 
		{
			return File.applicationStorageDirectory.resolvePath("matches/" + id + ".xml").exists;
		}
		
		private function isBannedPlayer(id:String):Boolean 
		{
			return ArrayUtils.contains(_bannedMatches, id);
		}
		
		private function onMatchesDataLoaded(e:Event):void 
		{
			handleComplete(new Event(Event.COMPLETE));
		}
	}
}