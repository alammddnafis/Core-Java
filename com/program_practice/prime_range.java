package com.program_practice;

import java.util.Scanner;

public class prime_range {
	    public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the 1st number:");
	       int n=sc.nextInt();
	       System.out.println("Enter the 2nd number:");
	       int m=sc.nextInt();
	       int result=0;
	       for(int i=n;i<=m;i++)
	       {
	       int count=0;

	           for(int j=1;j<=i;j++)
	           {
	               if(i%j==0)
	               {
	                   count++;
	               }
	           }
	           if(count==2)
	           {
	               result=i;		
	           }
	       
	    }
	       System.out.println(result);
	}
	
}
