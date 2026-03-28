package com.recursionProgram_practice;

public class neon {
public static void main(String[] args)
{
	int n=12;
	if(isNeon(n,n*n,0))
     System.out.println("it is neon number");
	else
		System.out.println("it is not neon number");
}
public static boolean isNeon(int n, int sq,int res)
{
	if(sq==0)
		return n==res;
	res+=sq%10;
	return isNeon(n,sq/10,res);
}
}
