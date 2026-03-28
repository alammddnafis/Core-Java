package com.program_practice;

public class perfectnoUsingMethod {
public static boolean isPerfect(int a)
{
	int temp=a;
	int result=0;
	for(int i=1;i<a;i++)
	{
		if(a%i==0)
			result+=i;
	}
	if(temp==result)
		return true;
	else
		return false;
}

public static void main(String[] args)
{
	int n=6;
	if(isPerfect(n))
	{
		System.out.println(n+" is a perfect number");
	}
	else
		System.out.println(n+" is a not perfect number");
}
}
