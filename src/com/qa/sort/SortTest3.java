package com.qa.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest3 
{

	public static void main(String[] args) 
	{
		int[] a = {55,12,58,98,47,88,69,28,67,49,55};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : a)
		{
			list.add(i);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
