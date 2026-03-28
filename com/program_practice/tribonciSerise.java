package com.program_practice;

public class tribonciSerise {
public static void main(String[] args)
{
int n=10;
 int a=0;
 int b=1;
 int c=1;
 System.out.print(a+" "+b+" "+c+" ");
 for(int i=4;i<=n;i++)
 {
	 int d=a+b+c;
	 System.out.print(d+" ");
	 a=b;
	 b=c;
	 c=d;
 }
}
}
