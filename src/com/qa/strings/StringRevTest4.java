package com.qa.strings;

public class StringRevTest4 
{

	public static void main(String[] args) 
	{
	  String str = "Java Selenium";
	  char[] ch  = str.toCharArray();
	  
	  String rev = "";
	  
	  for(int i=ch.length-1; i>=0; i--)
	  {
		  rev = rev + ch[i];
	  }
	  
	  System.out.println(rev);
	}

}
