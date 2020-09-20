package com.qa.strings;

public class FindDigitsSumFromString2 
{

	public static void main(String[] args)
	{
		String str = "1RameshSoft Java1587";
		char[] ch  = str.toCharArray();	  
		int sum = 0;	 
		for(char c : ch)
		{
			boolean b = Character.isDigit(c);
			
			if(b)
			{
				sum = sum + Character.getNumericValue(c);
			}
		}
		
		System.out.println("Sum of digits is: " +sum);
	}

}
