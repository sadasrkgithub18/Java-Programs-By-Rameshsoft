package com.qa.rameshsoft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNumbers 
{

	public static void main(String[] args) 
	{
		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = pattern.matcher("Selenium9 testing7 J2EE");
		String match = ""; 
		
		while(matcher.find())
		{
			match = match + matcher.group();		
		}
		
		System.out.println(match);
	}

}
