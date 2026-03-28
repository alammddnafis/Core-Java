package com.recursionProgram_practice;

public class prime {
public static void main(String[] args)
{
 int c=m1(1,10,0);
 System.out.println(c);
}
public static int m1(int st,int end,int sum)
{
	if(st>end)
		return sum;
	if(st%2==0)
	{
		sum+=st;
		
	}
	return m1(st+1,end,sum);
}
}
