package com.pattern;

public class p7 {
public static void main(String[] args)
{
	int n=9;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n/2+1;j++)
		{
			if((i==j) || (i+j==10) || (j==1))
			{
				System.out.print(" *");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
