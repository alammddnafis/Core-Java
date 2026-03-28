package com.program_practice;
import java.util.Scanner;
public class factor_check {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to check it's facrors");
	int n=sc.nextInt();
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
			count++;
		}
	}
	System.out.println("count="+count);
}
}
