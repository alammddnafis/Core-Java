package com.recursionProgram_practice;

public class spy {
public static void main(String[] args)
{
	int n=123;
	if(isSpy(n,0,1))
		System.out.println("it is spy number");
	else
		System.out.println("it is not spy number");
}
public static boolean isSpy(int n,int sum,int prod)
{
	if(n==0)
		return sum==prod;
	sum+=n%10;
	prod*=n%10;
	return isSpy(n/10,sum,prod);	
}
}
