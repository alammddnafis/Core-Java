package com.recursionProgram_practice;

public class strong {
public static void main(String[] args)
{
	range(1,1000);
//	int n=4058;
//	if(isStrong(n,n,0))
//		System.out.println("it is strong number");
//	else
//		System.out.println("it is not strong number");
	
}
public static void range(int st,int end)
{
	if(st>end)
		return;
	if(isStrong(st,st,0))
		System.out.println(st);
	
	 range(st+1,end);
}

public static boolean isStrong(int n,int temp,int res)
{
	if(n==0)
		return temp==res;
	int k=n%10;
	int facto=1;
	for(int i=1;i<=k;i++)
		facto*=i;
	res+=facto;
	return isStrong(n/10,temp,res);
}
}
