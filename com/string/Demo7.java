package com.string;

public class Demo7 {
public static void main(String[] args)
{
	String a="Software Developer";
	System.out.println(a.startsWith("Soft"));//true
	System.out.println(a.endsWith("per"));//true
	System.out.println(a.concat(" in google"));//Software Developer in google
	System.out.println(a.contains("vel"));//true
	System.out.println(a.charAt(2));//f
	System.out.println(a.indexOf('D'));//9
	System.out.println(a.lastIndexOf('e'));//16
	System.out.println(a.substring(9));
	System.out.println(a.substring(5,10));
}
}
