package com.qa.collection;

import java.util.HashMap;
import java.util.Map;

public class MapIterateUsingforEach 
{

	public static void main(String[] args) 
	{
		Map<String,String> gfg = new HashMap<String,String>(); 
	      
        // enter name/url pair 
		gfg.put("A", "JAVA"); 
        gfg.put("B", "Selenium"); 
        gfg.put("C", "Demo"); 
        gfg.put("D", "Automation");
        
        // forEach(action) method to iterate map 
        gfg.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v)); 
	}

}
