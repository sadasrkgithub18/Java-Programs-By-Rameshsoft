package com.qa.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept 
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
	  Hashtable h1 = new Hashtable();
	  
	  h1.put(1, "Java");
	  h1.put(2, "Selenium");
	  h1.put(3, "Automation");
	  
	  
	  Hashtable h2 = new Hashtable();
	  
	  h2 = (Hashtable) h1.clone();
	  
	  System.out.println("Values from h1: "+h1);
	  System.out.println("Values from h2: "+h2);
	  
	  h1.clear();
	  
	  System.out.println("Values from h1: "+h1);
	  System.out.println("Values from h2: "+h2);
	  
	 
	  Hashtable st = new Hashtable();
	  st.put("A", "Tom");
	  st.put("B", "Peter");
	  st.put("C", "John");
	  
	  if(st.containsValue("John"))
		  System.out.println("Value is found");
	  
	  Enumeration e = st.elements();
	  System.out.println("Print values from st:");
	  
	  while(e.hasMoreElements())
	  {
		  System.out.println(e.nextElement());
	  }
	  
	  System.out.println("print values from st using entry set");
	  
	  Set s = st.entrySet();
	  System.out.println(s);
	  
	  
	  
	  Hashtable st1 = new Hashtable();
	  st1.put("A", "Tom");
	  st1.put("B", "Peter");
	  st1.put("C", "John");
	  
	  if(st.equals(st1))
		  System.out.println("Both are equal");
	  
	  System.out.println(st1.get("A"));
	}

}
