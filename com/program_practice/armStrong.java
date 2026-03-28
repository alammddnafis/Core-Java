package com.program_practice;
import java.util.Scanner;
public class armStrong {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to check armstrong or not:");
	int n=s.nextInt();
	int temp=n;
	int length=(n+"").length();
	int res=0;
	while(n>0)
	{
		res+=Math.pow(n%10,length);
		n/=10;
	}
	if(temp==res)
	{
		System.out.println("It is an armStrong number");
	}
	else
		Math.pow(3, 2);
		System.out.println("it is not an armStrong number");
}
}
