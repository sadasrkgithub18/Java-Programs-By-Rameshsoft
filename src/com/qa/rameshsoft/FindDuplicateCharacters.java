package com.qa.rameshsoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters 
{

	public static void findDuplicates(String str)
	{
		Map<Character,Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();
		
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		
		for(char c1 : keys)
		{
			if(map.get(c1) > 1)
			{
				System.out.println(c1 + " is character present: "+map.get(c1)+" times");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		findDuplicates("Java Selenium Java Testing ");
	}

}
