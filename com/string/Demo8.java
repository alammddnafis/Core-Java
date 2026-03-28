package com.string;

public class Demo8 {
public static void main(String[] args)
{
	String s="developer";
	for(int i=0;i<=s.length()-1;i++)
	{
		System.out.println(s.charAt(i));
	}
	System.out.println(".................");
	char[] a=s.toCharArray();
	for(char c:a)
	{
		System.out.println(c);
	}
}
}
