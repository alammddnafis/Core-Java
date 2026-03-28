package com.recursionProgram_practice;

public class armStrong {
public static void main(String[] args)
{
	int n=153;
	int pow=(""+n).length();
	System.out.println(pow);
	if(isarm(n,n,pow,0))
		System.out.println("it is arm strong number");
	else
		System.out.println("it is not arm strong number");
}

public static boolean isarm(int n,int temp,int p,int res)
{
	if(n==0)
		return temp==res;
	res+=Math.pow(n%10, p);
	return isarm(n/10,temp,p,res);
}
}
