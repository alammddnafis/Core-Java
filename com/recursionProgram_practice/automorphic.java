package com.recursionProgram_practice;

public class automorphic {
public static void main(String[] args)
{
	int n=59;
	if(isAuto(n,n*n))
		System.out.println("It is automorphic number");
	else
		System.out.println("It is not automorphic number");
	
}
public static boolean isAuto(int n,int sq)
{
	if(n==0)
		return true;
	if(n%10!=sq%10)
		return false;
	return isAuto(n/10,sq/10);
}
}
