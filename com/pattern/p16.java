package com.pattern;

public class p16 {
public static void main(String[] args)
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n+4;j++)
		{
			if((i+j==6) || (i==5) || (j-i==4))
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
