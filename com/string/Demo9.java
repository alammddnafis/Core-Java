package com.string;

public class Demo9 {
public static void main(String[] args)
{
	String s="java 123 is very easy";
	String replaceAll=s.replaceAll("[0-9]", "");
	System.out.println(replaceAll);
}
}
