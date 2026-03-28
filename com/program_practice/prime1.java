package com.program_practice;
import java.util.Scanner;
public class prime1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numberto check prime or not");
		int n=s.nextInt();
		boolean flag=true;
		if(n<2)
		{
			System.out.println(n+" is not a prime number");
		    return;
		}
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
	if(flag) {
		System.out.println(n+" is a prime number");
	}
	else
	{
		System.out.println(n+" is not a prime number");
		
	}
	}
}
