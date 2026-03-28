package com.pattern;

public class p14 {
public static void main(String[] args)
{
	int n=5;
	int sp=n-1;
	int times=1;
	int num=0;
	for(int i=1;i<=n;i++)
	{
		for(int j=sp;j>0;j--)
		{
			System.out.print(" ");
		}
		for(int k=times;k>0;k--)
		{
			System.out.print(num);
		}
		System.out.println();
		num+=2;
		sp--;
		times++;
	}
}
}
