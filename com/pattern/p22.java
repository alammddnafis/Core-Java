package com.pattern;

public class p22 {
public static void main(String[] args)
{
	int n=5;
	for(int i=1;i<=n;i++)
	{   
		int k=i*n;
		if(i%2==0)
		{
			for(int j=k;j>=k-4;j--)
			{
				System.out.print(j+"\t");
			}
		}
		else
		{
		for(int j=k-4;j<=k;j++)
			System.out.print(j+"\t");
		}
		System.out.println();
		
	}
}
}
