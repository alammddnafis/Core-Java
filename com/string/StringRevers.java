package com.string;

public class StringRevers {
public static void main(String[] args)
{
	String s1="java";
	String s2="";//avaj
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2+=s1.charAt(i);
	}
	
	System.out.println(s2);
			
}
}
