package com.pattern;

public class p11 {
public static void main(String[] args)
{
	int n=4;
	int sp=n-1;
	int times=1;
	char ch='A';
	for(int i=1;i<=n;i++)
	{
		for(int j=sp;j>0;j--)
		{
		System.out.print(" ");
		}
		for(int k=times;k>0;k--)
		{
		System.out.print(ch);
		ch++;
		}
		System.out.println();
		sp--;
		times+=2;
	}
}
}
