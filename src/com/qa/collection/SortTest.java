package com.qa.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest 
{

	public static void main(String[] args) 
	{
	  int[] arr = {1,8,5,12,9,2};
	  
	  List<Integer> list = new ArrayList<>();
	  
	  for(int i : arr)
	  {
		  list.add(i);
	  }
	  
	  Collections.sort(list);
	  
	  System.out.println(list);
	  
	  System.out.println(list.size());
      
	  System.out.println("================================");
	  
	  List<Integer> finalList2 = new ArrayList<>();
	  finalList2.add(list.get(0));
	  for(int l=list.size()-1;l>0;l--)
	  {
		  finalList2.add(list.get(l));
	  }
	  System.out.println(finalList2);
	  
	  
	  
	 /* List<Integer> finalList = new ArrayList<>();
	  
	  Integer[] integers = list.toArray(new Integer[list.size()]);
	  
	  int[] primitives = ArrayUtils.toPrimitive(integers);
	  
	  finalList.add(1);
	  
	  for(int m=primitives.length-1;m>0;m--)
	  {
		  if(primitives[m]!=1)
		  {
			  finalList.add(primitives[m]);
		  }
	  }
	  
	  System.out.println(finalList);*/
	  
	  
		 
	}

}
