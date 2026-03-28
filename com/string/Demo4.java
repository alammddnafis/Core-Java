package com.string;

public class Demo4 {
public static void main(String[] args)
{
	String s1="abcd";
	//char[] c=s1.toCharArray();
	//System.out.println(c[0]);
//	for(char ch:c)
//	{
//		System.out.println(ch);
//	}
	System.out.println(s1.indexOf('c'));
	System.out.println(s1.charAt(3));
	char[] c1=s1.toCharArray();
	System.out.println(c1[2]);
}
}
