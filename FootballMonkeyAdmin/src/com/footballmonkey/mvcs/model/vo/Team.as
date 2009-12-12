package com.footballmonkey.mvcs.model.vo
{
	import mx.collections.ArrayCollection;
	
	[Bindable]
	[Table(name="teams")]
	public class Team
	{
		public static var MOCCASIN_CHILDREN_PROPERTY:String = "players";
		
		[Id]
		[Column(name="team_id")]
		public var team_id:int;
		
		public var id:int;
		
		public var name:String;
		
		public var players:Array = [];
	}
}