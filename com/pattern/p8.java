package com.pattern;

public class p8 {
public static void main(String[] args)
{
	int n=5;
	int st=1;
	int sp=n-1;
	for(int i=1;i<=n;i++)
	{
		for(int j=sp;j>0;j--)
		{
			System.out.print("  ");
		}
		for(int k=st;k>0;k--)
		{
			System.out.print(" *");
		}
		System.out.println();
		st+=2;
		sp--;
	}
}
}
