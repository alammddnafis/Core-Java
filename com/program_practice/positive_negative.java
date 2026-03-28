package com.program_practice;
import java.util.Scanner;
public class positive_negative {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the number to check number is +ve or -ve");
	int n=s.nextInt();
	if(n>=0)
		System.out.println(n+"is +ve number");
	else
		System.out.println(n+" is negative number");
}
}
