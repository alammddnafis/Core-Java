package com.pattern;

public class p18 {
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j-i==2|| i-j==2 || i+j==8 || i+j==4)
				{
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
