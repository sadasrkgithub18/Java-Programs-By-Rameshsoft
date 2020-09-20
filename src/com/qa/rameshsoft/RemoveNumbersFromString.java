package com.qa.rameshsoft;

import java.util.ArrayList;
import java.util.List;

public class RemoveNumbersFromString 
{

	public static void main(String[] args) 
	{
	  String s = "Java1 Selnium3 DevOps5";
	  char[] ch = s.toCharArray();
	  
	  List<Character> list = new ArrayList<>();
	  
	  for(char c : ch)
	  {
		  if(!Character.isDigit(c))
		  {
			  list.add(c);
		  }
	  }
	  
	  System.out.println(list);
	}

}
