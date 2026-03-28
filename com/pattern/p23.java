package com.pattern;

public class p23 {
public static void main(String[] args)
{
	int n=5;
	int num=1;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			int k=(num-1)+i;
		
		for(int j=i;j>0;j--)
		{
			System.out.print((k--)+"\t");
			num++;
		}
		}
		else
		{
			for(int j=i;j>0;j--)
			{
				System.out.print((num++)+"\t");
			}
		}
		System.out.println();
	}
}
}

