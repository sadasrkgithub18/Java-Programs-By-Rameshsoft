package com.qa.sort;

import java.util.Arrays;

public class PrintMissingNumbers 
{

	public static void main(String[] args) 
	{
	   int[] ques = {5,3,3,5,1};
	   
	   Arrays.sort(ques);
	   
	   int[] output = new int[ques.length+1];
	   
	   for(int i : ques)
	   {
		   output[i] = 1;
	   }
	   
	   for(int i = 1; i<output.length; i++)
	   {
		   if(output[i] == 0)
		   {
			   System.out.println(i);
		   }
	   }
		
	}

}
