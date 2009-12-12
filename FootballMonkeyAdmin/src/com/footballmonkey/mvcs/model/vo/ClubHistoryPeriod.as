package com.footballmonkey.mvcs.model.vo
{
	[Bindable]
	[Table(name="club_history_period")]
	public class ClubHistoryPeriod
	{
		[Id]
		[Column(name="club_history_id")]
		public var club_history_id:int;
		
		public var club:String;
		
		public var dateJoined:String;
		
		public var dateLeft:String;
		
		public var trialist:String;
	}
}