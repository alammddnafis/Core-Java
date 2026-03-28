package com.pattern;
public class p28 {
public static void main(String[] args)
{
	int n=5;
	int sp=n/2;
	int times=1;
	for(int i=1;i<=n;i++)
	{
		int num=1;
		for(int j=sp;j>0;j--)
		{
		 System.out.print(" ");
		}
		for(int k=times;k>0;k--)
		{
			System.out.print(num++);	
		}
		for(int l=times-1;l>0;l--)
		{
			System.out.print(l);	
		}
		System.out.println();

	if(i<=n/2)
	{
		sp--;
		times++;
	}
	else
	{
		sp++;
		times--;
	}
}
}
}
