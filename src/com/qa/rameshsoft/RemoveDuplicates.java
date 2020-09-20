package com.qa.rameshsoft;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
	  int[] a = {10,20,30,10,20,30,45,55,10,20,30};
	  
	  Set<Integer> set = new HashSet<>();
	  
	  for(Integer i : a)
	  {
		  set.add(i);
	  }
	  
	  System.out.println(set);
	}

}
