package com.string;

public class Demo3 {
public static void main(String[] args)
{
	String s="Java Developer";
	System.out.println(s.length());//14
	System.out.println(s.toUpperCase());//JAVA DEVELOPER
	System.out.println(s.toLowerCase());//java developer
	System.out.println(s.charAt(5));//D
	System.out.println(s.indexOf('e'));//6
	System.out.println(s.indexOf("Dev"));//5
	System.out.println(s.indexOf('e',9));//12
	System.out.println(s.indexOf("loper",4));//9
	System.out.println(s.lastIndexOf('e'));//12
}
}
