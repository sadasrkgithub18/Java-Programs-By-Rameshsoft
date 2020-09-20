package com.qa.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDigitsSumUsingRegEX 
{

	public static void main(String[] args) 
	{
	
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher("1RameshSoft Java1587");		
		int sum = 0 ;	
		while(matcher.find())
		{
			String match = matcher.group();
			int i = Integer.parseInt(match);
			sum = sum + i;
		}
		System.out.println("Sum of digits is: " +sum);	
	}
}
