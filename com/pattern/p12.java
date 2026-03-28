package com.pattern;

public class p12 {
public static void main(String[] args)
{
	int n=5;
	int times=n;
	int sp=0;
	char ch='a';
	for(int i=1;i<=n;i++)
	{
		for(int j=sp;j>0;j--)
		{
			System.out.print(" ");
		}
		for(int k=times;k>0;k--)
		{
			System.out.print(ch);
		}
		System.out.println();
		ch++;
		times--;
		sp++;
	}
}
}
