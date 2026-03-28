package com.string;

public class Strpro {
public static void main(String[] args)
{
	String s1="developer";
	String s3="Developer";
	System.out.println(s1==s3);//false
	System.out.println(s1.equals(s3));//false
	System.out.println(s1.equalsIgnoreCase(s3));//true
	String s2=s1.substring(2);
	System.out.println(s2);
	System.out.println(s1.length());
    System.out.println(s1.charAt(6));
    System.out.print(s1.indexOf('v'));
    char[] a=s1.toCharArray();
    for(char c:a)
    {
    	System.out.println(c);
    }
}
}
