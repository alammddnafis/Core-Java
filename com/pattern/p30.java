package com.pattern;

public class p30 {
	public static void main(String[] args)
	{
		int n=5;
		int sp=n-1;
		int times=1;
		int num=1;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=sp;j>0;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=times;k++)
			{
				if(k==1 || i==n || k==times)
				{
					System.out.print(" "+ch++);
				}
				else
				{
					System.out.print(" "+num++);
				}
			}
			System.out.println();
			times+=2;
			sp--;
			
		}
	}
}
