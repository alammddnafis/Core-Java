package com.program_practice;

public class palindrome {
public static void main(String[] args)
{
	int st=1;
	int end=50;
	for(int i=st;i<=end;i++)
	{
		
	int n=i;
	int temp=n;
	int rev=0;
	while(n>0)
	{
		rev=(rev*10)+n%10;
		n/=10;
	}
	if(temp==rev)
	{
		System.out.print(i+" ");
	}

}
}
}
