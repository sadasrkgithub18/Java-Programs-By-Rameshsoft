package com.qa.strings;

public class StringRevTest1 
{

	public static void main(String[] args) 
	{
	  String str = "Java Selenium";
	  
	  StringBuffer sb = new StringBuffer(str);
	  String rev = sb.reverse().toString();
	  
	  System.out.println("After String Reverse: "+rev);
	}

}
