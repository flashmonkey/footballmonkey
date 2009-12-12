package com.footballmonkey.mvcs.model.vo
{
	[Bindable]
	[Table(name="player_stats")]
	public class PlayerStat
	{
		[Id]
		[Column(name="player_stats_id")]
		public var id:int;
		
		public var competition:String;
		
		public var team:String;
		
		public var period:String;
		
		public var fullapps:int;
		
		public var subs:int;
		
		public var cleansheets:int;
		
		public var goalsconceded:int;
		
		public var yellowcards:int;
		
		public var redcards:int;
	}
}