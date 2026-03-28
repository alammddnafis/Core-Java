package com.recursionProgram_practice;

public class factorial {
public static void main(String[] args)
{
	int n=5;
	int res=isfact(n,1);
	System.out.println(res);
}
public static int isfact(int n,int res)
{
	if(n==0)
		return res;
	res*=n;
	
	return isfact(n-1,res);
	
}
}
