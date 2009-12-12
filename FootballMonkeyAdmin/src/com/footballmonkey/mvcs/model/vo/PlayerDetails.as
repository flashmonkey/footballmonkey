package com.footballmonkey.mvcs.model.vo
{
	[Bindable]
	[Table(name="player_details")]
	public class PlayerDetails
	{
		[Id]
		[Column(name="player_details_id")]
		public var id:String;
		
		public var country:String;
		
		public var born:String;
		
		public var birthplace:String;
		
		public var weight:String;
		
		public var height:String;
		
		public var position:String;
	}
}