package com.program_practice;

public class swap {
public static void main(String[] args)
{
	int a=10;
	int b=20;
	System.out.println("Before swaping A is:"+a);
	System.out.println("Before swaping B is:"+b);
	
	int temp=a;
	a=b;
	b=temp;
	
	System.out.println("****************************");
	
	System.out.println("After swaping A is:"+a);
	System.out.println("After swaping B is:"+b);
}
}
