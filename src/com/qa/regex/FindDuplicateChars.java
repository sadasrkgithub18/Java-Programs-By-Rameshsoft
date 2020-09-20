package com.qa.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDuplicateChars 
{

	public static void main(String[] args) 
	{
	  Pattern pattern = Pattern.compile("e");
	  Matcher matcher = pattern.matcher("Selenium testing J2EE");
	  
	  int count = 0;
	  while(matcher.find())
	  {
		  count++;
	  }
	  
	  System.out.println("No.of Occurences of character is: " +count);
	}

}
