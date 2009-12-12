package com.footballmonkey.mvcs.model.vo
{
	[Bindable]
	[Table(name='players')]
	public class Player
	{
		[Id(strategy="assigned")]
		[Column(name='player_id')]
		public var player_id:int;
		
		public var id:int;
		
		public var name:String;
		
		public var details:PlayerDetails;
		
		public var description:String;
		
		public var clubHistory:Array;
		
		public var playerStats:Array;
	}
}