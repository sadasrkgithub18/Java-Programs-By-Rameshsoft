package com.qa.strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StringRevTest3 
{

	public static void main(String[] args) 
	{
	  String str = "Java Selenium";
	  
	  char[] ch = str.toCharArray();
	  
	  List<Character> list = new ArrayList<>();
	  
	  for(char c : ch)
	  {
		  list.add(c);
	  }
	  
	  Collections.reverse(list);
	  
	  for(Character c : list)
	  {
		  System.out.print(c);
	  }
	    
	}
}
