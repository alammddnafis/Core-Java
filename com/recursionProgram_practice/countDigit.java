package com.recursionProgram_practice;

public class countDigit {
public static void main(String[] args)
{
	System.out.println(count(145,0));
}
public static int count(int n,int c)
{
	if(n==0)
		return c;
	return count(n/10,++c);
}
}
