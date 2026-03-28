package com.string;

public class stringEquals {
public static void main(String[] args)
{
	String s1=new String("Nafis");
	String s2=new String("Nafis");
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//true
	
	System.out.println(".....................");
	
	StringBuffer sb1=new StringBuffer("Nafis");
	StringBuffer sb2=new StringBuffer("Nafis");
	System.out.println(sb1==sb2);//false
	System.out.println(sb1.equals(sb2));//false
}
}
