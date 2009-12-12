package com.footballmonkey.mvcs.service.operation
{
	import com.footballmonkey.mvcs.service.IStatsService;
	import com.joeberkovitz.moccasin.service.AbstractOperation;
	
	import flash.events.Event;
	import flash.filesystem.File;

	public class RetrieveStatsToFilesOperation extends AbstractOperation
	{
		protected var _service:IStatsService;
		
		public function RetrieveStatsToFilesOperation(service:IStatsService)
		{
			super();
			
			_service = service;
		}
		
		public override function execute():void
		{
			loadPlayers();
		}
		
		protected function loadPlayers():void 
		{
			var sequence:OperationSequence = new OperationSequence();
			
			var dir:File = File.applicationStorageDirectory;
			
			// Load the 'general' data.
			sequence.addOperation(new SaveResultOperation(_service.loadTeams(), dir.resolvePath("teams.xml")));
			sequence.addOperation(new SaveResultOperation(_service.loadPlayers(), dir.resolvePath("players.xml")));
			sequence.addOperation(new SaveResultOperation(_service.loadMatches(), dir.resolvePath("matches.xml")));

			// Then load the 'details' of the players and matches.
			sequence.addOperation(new LoadPlayersDataOperation(dir.resolvePath("players.xml"), _service));
			sequence.addOperation(new LoadMatchesDataOperation(dir.resolvePath("matches.xml"), _service));
			
			sequence.addEventListener(Event.COMPLETE, handleComplete);
			sequence.execute();
		}
	}
}