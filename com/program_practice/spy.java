package com.program_practice;

public class spy {
public static void main(String[] args)
{
	int n=112412;
	int temp=n;
	int sum=0;
	int prod=1;
	while(n>0)
	{
	 sum+=n%10;
	 n/=10;
	}
	n=temp;
	while(n>0)
	{
	 prod*=n%10;
	 n/=10;
	}
	if(sum==prod)
	{
		System.out.println(temp+" is a spy number");
	}
	else
		System.out.println(temp+" is not a spy number");	
}
}
