package com.program_practice;

public class evenUsingMethod {
	
	static boolean isEven(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		int n=6;
		boolean result=isEven(n);
		if(result)
			System.out.println("it is even number");
		else
			System.out.println("it is odd number");

}
}
