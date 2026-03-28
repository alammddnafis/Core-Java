package com.program_practice;

public class even_sum {
public static void main(String[] args)
{
	int n1=2;
	int n2=10;
	int sum=0;
	for(int i=n1;i<=n2;i++)
	{
		if(i%2==0)
		{
			System.out.print(" "+i);
			sum+=i;
		}
	}
	System.out.println();
	System.out.println("sum of even number is:"+sum);
}
}
