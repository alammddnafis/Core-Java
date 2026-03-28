package com.pattern;

public class p15 {
public static void main(String[] args)
{
	int n=5;
	int sp=n/2;//2 1 0
	int st=1;//  1 3 2
	for(int i=1;i<=n;i++)//1 2 3
	{
		if(i>n/2)
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
			st-=2;
			sp++;
		}
		else
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
}
