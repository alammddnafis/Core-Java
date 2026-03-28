package com.string;

public class Demo2 {
public static void main(String[] args)
{
	String s="javadeveloper";
	System.out.println(s.length());//13
	System.out.println(s.charAt(5));//e
	System.out.println(s.indexOf('e'));//5
	System.out.println(s.indexOf("dev"));//4
	System.out.println(s.indexOf("ab"));//-1
	System.out.println(s.indexOf('e', 8));//11
	System.out.println(s.indexOf('a'));//1
}
}
