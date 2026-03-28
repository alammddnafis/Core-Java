package com.program_practice;

public class swap_withOutUsingThiredVariable {
public static void main(String[] args)
{
	int a=10;
	int b=20;
	System.out.println("Before swapping A is:"+a);//10
	System.out.println("Before swapping B is:"+b);//20
	
	a=a+b;//30
	b=a-b;//30-20=10
	a=a-b;//30-10=20
	
	System.out.println("**************************");
	System.out.println("After swapping A is:"+a);//20
	System.out.println("After swapping B is:"+b);//10
}
}
