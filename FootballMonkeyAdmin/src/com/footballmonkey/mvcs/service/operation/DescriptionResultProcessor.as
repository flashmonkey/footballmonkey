package com.footballmonkey.mvcs.service.operation
{
	public class DescriptionResultProcessor implements IResultProcessor
	{
		public function processResult(s:String):String
		{
			var splitString:Array = s.split("<description>");
			
			var preDescription:String = splitString[0];
			
			splitString = String(splitString[1]).split("</description>");
			
			var postDescription:String = splitString[1];
			
			var stripped:String = String(splitString[0]).replace(/<(.|\n)*?>/g, "");
			
			//return new XML(preDescription + "<description>" + stripped + "</description>" + postDescription);
			
			return preDescription + "<description>" + stripped + "</description>" + postDescription;
		}		
	}
}