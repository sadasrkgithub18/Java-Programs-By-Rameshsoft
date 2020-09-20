package com.qa.sort;

import java.util.Arrays;

public class SortTest2 
{

	public static void main(String[] args) 
	{
		int[] a = {55,12,58,98,47,69,28,67,49,55};
		  
		Arrays.sort(a);
		
		for(int i : a)
		{
			System.out.println(i);
		}
	}

}
