package com.footballmonkey.mvcs.service.operation
{
	import com.footballmonkey.ioc.factory.xml.preprocessors.PlayerDetailsPreprocessor;
	import com.footballmonkey.ioc.factory.xml.preprocessors.PlayersListPreprocessor;
	import com.footballmonkey.ioc.factory.xml.preprocessors.TraceXMLPreprocessor;
	import com.joeberkovitz.moccasin.service.AbstractOperation;
	
	import flash.events.Event;
	import flash.filesystem.File;
	
	import org.springextensions.actionscript.context.support.XMLApplicationContext;
	import com.footballmonkey.ioc.factory.xml.preprocessors.TeamsListPreprocessor;
	import com.footballmonkey.ioc.factory.xml.preprocessors.RemoveAllPlayersNodePreprocessor;
	import com.footballmonkey.ioc.factory.xml.preprocessors.MatchDetailsPreprocessor;
	import com.footballmonkey.context.support.XMLAwareApplicationContext;
	import flash.utils.getTimer;

	public class GenerateApplicationContextOperation extends AbstractOperation
	{
		private var _applicationContext:XMLAwareApplicationContext;
		
		private var _startTime:int;
		
		public function GenerateApplicationContextOperation()
		{
			super();
		}
		
		public override function execute():void
		{
			_startTime = getTimer();
			
			_applicationContext = new XMLAwareApplicationContext();
			
			_applicationContext.addConfigLocation(File.applicationStorageDirectory.resolvePath("players.xml").nativePath);
			//_applicationContext.addConfigLocation(File.applicationStorageDirectory.resolvePath("matches.xml").nativePath);
			//_applicationContext.addConfigLocation(File.applicationStorageDirectory.resolvePath("teams.xml").nativePath);
			
			var playersDir:File = File.applicationStorageDirectory.resolvePath("players");
			var files:Array = playersDir.getDirectoryListing();

			var i:int = 0;
			
			for each (var file:File in files)
			{
				if (i < files.length)
				{
					_applicationContext.addConfigLocation(file.nativePath);
					i++;
				}
				else
					break;
			}
			
			var matchesDir:File = File.applicationStorageDirectory.resolvePath("matches");
			files = matchesDir.getDirectoryListing();
			i = 0;
			
			for each (file in files)
			{
				if (i < files.length)
				{
					_applicationContext.addConfigLocation(file.nativePath);
					i++;
				}
				else
					break;
			}
			
			//_applicationContext.parser.addPreprocessor(new CreateObjectsNodePreprocessor());
			_applicationContext.parser.addPreprocessor(new TeamsListPreprocessor());
			_applicationContext.parser.addPreprocessor(new PlayersListPreprocessor());
			_applicationContext.parser.addPreprocessor(new PlayerDetailsPreprocessor());
			_applicationContext.parser.addPreprocessor(new RemoveAllPlayersNodePreprocessor());
			_applicationContext.parser.addPreprocessor(new MatchDetailsPreprocessor());
			//_applicationContext.parser.addPreprocessor(new RemoveTeamsNodePreprocessor());
			
			//_applicationContext.parser.addPreprocessor(new TraceXMLPreprocessor());
			
			_applicationContext.addEventListener(Event.COMPLETE, onApplicationContextComplete);
			
			_applicationContext.load();
		}
		
		private function onApplicationContextComplete(e:Event):void 
		{
			_applicationContext.saveXML(File.applicationStorageDirectory.resolvePath("premiership-context.xml"));
			
			var duration:int = (getTimer() - _startTime) / 1000;
			
			trace("Processing complete in " + duration + " seconds");
			
			handleComplete(e);
		}
	}
}