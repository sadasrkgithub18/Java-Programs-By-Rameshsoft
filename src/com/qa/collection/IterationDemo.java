package com.qa.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterationDemo 
{

	public static void main(String[] args) 
	{
		Map<String,String> gfg = new HashMap<String,String>(); 
	      
        // enter name/url pair 
        gfg.put("A", "JAVA"); 
        gfg.put("B", "Selenium"); 
        gfg.put("C", "Demo"); 
        gfg.put("D", "Automation"); 
          
        // looping over keys 
        for (String key : gfg.keySet())  
        { 
            // search  for value 
            String url = gfg.get(key); 
            System.out.println("Key = " + key + ", Value = " + url); 
        } 
        
        System.out.println("=======================");

        for (Entry<String, String> entry : gfg.entrySet())  
        { 
            // search  for value 
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value); 
        } 
        
	}

}
