package com.pattern;

public class p21 {
public static void main(String[] args)
{
	int n=9;
	int sp=0;//0 1 2 1
	int st=n;//5 3 1 3
	for(int i=1;i<=n;i++)//1 2 3
	{
		for(int k=sp;k>0;k--)
		{
			System.out.print("  ");
		}
		for(int j=st;j>0;j--)
		{
			System.out.print(" *");
		}
		System.out.println();
		if(i<=n/2)
		{
			st-=2;
			sp++;
		}
		else
		{
			st+=2;
			sp--;
		}
	}
}
}
