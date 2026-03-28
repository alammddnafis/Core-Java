package com.recursionProgram_practice;

public class perfect {
	public static void main(String[] args)
	{
		int n=6;
		boolean result=isper(n,1,0);
		if(result)
		{
			System.out.println("it is perfect number");
		}
		else
			System.out.println("it is not perfect number");
    }
	public static boolean isper(int n,int i,int sum)
	{
		if(i>n/2)
			return sum==n;
		if(n%i==0)
			sum+=i;
		return isper(n,i+1,sum);
	}
}
