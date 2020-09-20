package com.qa.sort;

import java.util.TreeSet;

public class SortTest1 
{

	public static void main(String[] args) 
	{
	  int[] a = {55,12,58,98,47,69,28,67,49,55};
	  
	  TreeSet<Integer> ts = new TreeSet<>();
	  
	  for(int i : a)
	  {
		  ts.add(i);
	  }
	  
	  System.out.println(ts);
	}

}
