package com.program_practice;

public class demo {
public static void main(String[] args)
{
	System.out.println("Before for loop");
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
		{
//			return; //it will terminate the program
//			break;  // it will terminate the current loop
			continue;//it will skip the current iteration
		}
		System.out.println(i);
	}
	System.out.println("After loop");
}
}
