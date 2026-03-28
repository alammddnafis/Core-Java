package com.program_practice;

public class primeUsingMethod {
public static boolean isPrime(int a)
{
	if(a<=1)
		return false;
	else
	{
		int count=0;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==1)
			return true;
		else 
			return false;
	}
}

public static void main(String[]args)
{
	int n=5;
	if(isPrime(n))
		System.out.println("it is prime number");
	else
		System.out.println("it is not prime number");
}
}
