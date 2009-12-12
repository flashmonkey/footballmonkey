package com.footballmonkey
{
	import mx.core.WindowedApplication;
	import mx.events.FlexEvent;

	public class Main extends WindowedApplication
	{
		
		public function Main()
		{
			super();
			
			addEventListener(FlexEvent.APPLICATION_COMPLETE, onApplicationComplete);
		}
		
		private function onApplicationComplete(e:FlexEvent):void 
		{
			removeEventListener(FlexEvent.APPLICATION_COMPLETE, onApplicationComplete);
			
			
		}
	}
}