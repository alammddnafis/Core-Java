package com.program_practice;

public class hcf {
public static void main(String[] args)
{
	int a=20;
	int b=25;
	int n=a>b?b:a;
	while(true)
	{
		if(a%n==0 && b%n==0)
		{
			break;
		}
		n--;
	}
	System.out.println(n);
}
}
