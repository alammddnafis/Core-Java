package com.program_practice;
import java.util.Scanner;
public class leapYear {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("CHECK LEAP YEAR OR NOT");
	System.out.println("************************");
	System.out.println("Enther the year to check leap year or not");
	int year=sc.nextInt();
	if (year%4==0 ||  year%400==0 && year%100!=0)
	{
		System.out.println(year+" is a leap year");
	}
	else
		System.out.println(year+" is not a leap year");
}
}
