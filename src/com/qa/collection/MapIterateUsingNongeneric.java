package com.qa.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapIterateUsingNongeneric 
{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		 Map  map=new LinkedHashMap();        
	     map.put("A","Amit");    
	     map.put("B","Vijay");    
	     map.put("C","Rahul");
	     
	     Set keys = map.keySet();
	     Iterator itr  = keys.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 Object obj = itr.next();
	    	 String key = (String) obj;
	    	 Object val = map.get(key);
	    	 String value = (String) val;
	    	 
	    	 System.out.println(key+ "  "+value);
	     }
	     
	     
	     System.out.println("==================================");
	     
	     Iterator entries = map.entrySet().iterator();
	     
	     while (entries.hasNext()) 
	     {
	         Map.Entry entry = (Map.Entry) entries.next();
	         String key = (String)entry.getKey();
	         String value = (String)entry.getValue();
	         System.out.println("Key = " + key + ", Value = " + value);
	     }
	     
	     System.out.println("==================================");
	}

}
