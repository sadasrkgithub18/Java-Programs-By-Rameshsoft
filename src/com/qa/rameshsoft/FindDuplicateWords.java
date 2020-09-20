package com.qa.rameshsoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWords 
{
	public static void findDuplicates(String str)
	{
		Map<String, Integer> map = new HashMap<>();
		String[] s = str.split(" ");
		
		for(String s1 : s)
		{
			if(map.containsKey(s1))
			{
				map.put(s1, map.get(s1)+1);
			}
			else
			{
				map.put(s1, 1);
			}	
		}
		
		Set<String> keys = map.keySet();
		
		for(String c1 : keys)
		{
			if(map.get(c1) > 1)
			{
				System.out.println(c1+" is present: " + map.get(c1)+" times");
			}
		}
		
	}

	public static void main(String[] args) 
	{
		findDuplicates("Java Selenium Java test Java test Selenium");
	}

}
