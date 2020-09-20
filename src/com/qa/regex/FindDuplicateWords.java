package com.qa.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDuplicateWords 
{

	public static void main(String[] args) 
	{
	  Pattern pattern = Pattern.compile("Java");
	  Matcher matcher = pattern.matcher("Java Selenium Testing and Java DevOps Java Java test");
	  
	  int count = 0;
	  while(matcher.find())
	  {
		  count++;
	  }
	  
	  System.out.println("No.of Occurences of word is: "+count);
	  
	}

}
