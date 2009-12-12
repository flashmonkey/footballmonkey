package com.footballmonkey.util
{
	public class ArrayUtils
	{
		public static function contains(a:Array, o:*):Boolean
		{
			for each (var obj:* in a)
			{
				if (obj == o)
				{
					return true;
				}
			}
			
			return false;
		}

	}
}