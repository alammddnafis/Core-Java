package com.pattern;

public class p2 {
public static void main(String[] args)
{   int n=5;
	int st=5;
	int sp=0;
	for(int i=1;i<=n;i++)
	{
			for(int k=sp;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int l=st;l>0;l--)
			{
			System.out.print("*");
			}
		System.out.println();
		st--;
		sp++;
		
	}
}
}
