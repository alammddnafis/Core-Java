package com.program_practice;

public class strongNum {
	public static boolean isSrong(int n)
	{
		int temp=n;
		int result=0;
		while(n>0)
		{
			int re=1;
			int j=n%10;
			for(int i=1;i<=j;i++)
				re*=i;
			result+=re;
			n/=10;
		}
		if(temp==result)
			return true;
		else
			return false;
	}
public static void main(String[] args)
{
	int n=145;
	if(isSrong(n))
	{
		System.out.println(n+" it is strong number");
	}
	else
		System.out.println("it is not strong number");
}
}
