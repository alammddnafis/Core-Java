package com.pattern;

public class p26 {
public static void main(String[] args)
{
	int n=5;
	int sp=0;
	int times=5;
	int num=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=sp;j>0;j--)
		{
			System.out.print(" ");
		}
		for(int k=times;k>0;k--)
		{
			if(i<=n/2)
			System.out.print(num++);
			else
				System.out.print(num--);
		}
			System.out.println();
			if(i<=n/2)
			{
				sp++;
				times-=2;
			}
			else
			{
				sp--;
				times+=2;
				
			}
	}
}
}
