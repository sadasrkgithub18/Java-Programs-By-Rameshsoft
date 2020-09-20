package com.qa.strings;

public class FindDigitsSumFromString 
{

	public static void main(String[] args)
	{
	  String str = "1RameshSoft Java1587";
	  char[] ch  = str.toCharArray();
	  
	  int sum = 0;
	  
	  for(int i=0;i<ch.length;i++)
	  {
		 if(Character.isDigit(ch[i]))
		 {
			 sum = sum + Character.getNumericValue(ch[i]);
		 }
	  }
	  System.out.println("Sum of digits is: " +sum);  
	}
}
