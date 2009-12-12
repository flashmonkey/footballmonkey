package com.footballmonkey.mvcs.model.vo
{
	import mx.collections.ArrayCollection;
	
	[Bindable]
	[Table(name="matches")]
	public class Match
	{
		[Id]
		[Column(name="match_id")]
		public var match_id:int;
		
		public var id:int;
		
		public var matchdate:String;
		
		public var score:String;
		
		public var hometeam:Team;
		
		public var awayteam:Team;
		
		public var venue:String;
		
		public var attendance:int;
		
		public var homeplayers:Array;
		
		public var awayplayers:Array;
		
		public var referee:String;
	}
}