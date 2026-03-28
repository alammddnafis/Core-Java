package com.recursionProgram_practice;

public class PerfectRange {
public static void main(String[] args)
{
	range(1,100);
}
public static void range(int st,int end)
{
	if(st>end)
		return;
	if(isper(st,1,0))
		System.out.print(st+" ");
	range(st+1,end);
}
public static boolean isper(int n,int i,int sum)
{
	if(i>n/2)
		return n==sum;
	if(n%i==0)
		sum+=i;
	return isper(n,i+1,sum);
}
}
