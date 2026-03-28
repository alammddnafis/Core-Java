package com.pattern;

public class p9 {
public static void main(String[] args)
{
	int n=9;
	int st=n;
	int sp=0;
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
		sp++;
		st-=2;
	}
}
}
