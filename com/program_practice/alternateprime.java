package com.program_practice;

public class alternateprime {
	public static void main(String[] args)
	{
		int st=3;
		int end=50;
		boolean flag=true;
		for(int i=st;i<=end;i++)
		{ 
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
				if(flag)
				System.out.print(" "+i);
				flag=!flag;
			}
			
		}
	}
}
