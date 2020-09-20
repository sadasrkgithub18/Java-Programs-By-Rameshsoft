package com.qa.strings;

public class StringRevTest2 
{

	public static void main(String[] args) 
	{
		String str = "Java With Selenium";
		String rev = "";
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("After string reverse value is: "+rev);
	}

}
