package com.footballmonkey.mvcs.service
{
	import com.footballmonkey.mvcs.service.operation.DescriptionResultProcessor;
	import com.joeberkovitz.moccasin.service.IOperation;
	import com.joeberkovitz.moccasin.service.XmlHttpOperation;

	public class AFSService implements IStatsService
	{
		private var _baseUrl:String = "";
		
		public function set baseUrl(value:String):void 
		{
			_baseUrl = value;
		}
		
		private var _appendix:String = "";
		
		public function set appendix(value:String):void 
		{
			_appendix = value;
		}
		
		private var _teamsToken:String = "";
		
		public function set teamsToken(value:String):void 
		{
			_teamsToken = value;
		}
		
		private var _playerToken:String = "";
		
		public function set playerToken(value:String):void 
		{
			_playerToken = value;
		}
		
		private var _playersToken:String = "";
		
		public function set playersToken(value:String):void 
		{
			_playersToken = value;
		}
		
		private var _matchToken:String = "";
		
		public function set matchToken(value:String):void 
		{
			_matchToken = value;
		}
		
		private var _matchesToken:String = "";
		
		public function set matchesToken(value:String):void 
		{
			_matchesToken = value;
		}
		
		public function AFSService()
		{
		}

		public function loadTeams():IOperation
		{
			return new XmlHttpOperation(_baseUrl + _teamsToken + _appendix);
		}
		
		public function loadPlayers():IOperation
		{
			return new XmlHttpGetOperation(_baseUrl + _playersToken + _appendix);
		}
		
		public function loadPlayer(playerID:int):IOperation
		{
			var operation:XmlHttpGetOperation = new XmlHttpGetOperation(_baseUrl + _playerToken + "/" + playerID + _appendix);
			operation.addResultProcessor(new DescriptionResultProcessor());
			
			return operation;
		}
		
		public function loadMatches():IOperation
		{
			return new XmlHttpGetOperation(_baseUrl + _matchesToken + _appendix);
		}
		
		public function loadMatch(matchID:int):IOperation
		{
			return new XmlHttpGetOperation(_baseUrl + _matchToken + "/" + matchID + _appendix);
		}
	}
}