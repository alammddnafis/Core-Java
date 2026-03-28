package com.program_practice;
import java.util.Scanner;
public class automorphic {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enetr the number to check automorphic or not:");
	int n=s.nextInt();
	int temp=n;
	int sq=n*n;
	int i=1;
	while(n>0)
	{
		n/=10;
		i*=10;
	}
	if(temp==(sq%i))
	{
		System.out.println(temp+" is automorphic number");
	}
	else
		System.out.println(temp+" is not a automorpic number");
}
}
