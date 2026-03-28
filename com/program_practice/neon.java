package com.program_practice;

public class neon {
public static void main(String[] args)
{
	int n=10;
	int temp=n;
	int sq=n*n;
	int result=0;
	while(sq>0)
	{
		result+=sq%10;
		sq/=10;
	}
	if(temp==result)
	{
		System.out.println(temp+" is a neon number");
	}
	else
		System.out.println(temp+" is not a neon number");
}
}
