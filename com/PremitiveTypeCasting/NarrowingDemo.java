package com.PremitiveTypeCasting;

public class NarrowingDemo {

	public static int m1()
	{
		return (int)5.5;//narrowing double to int
	}
	
	public static void m2(int n)
	{
		System.out.println("m2 is executed:"+n);
	}
	
	public static void main(String[] args) {
		System.out.println(m1());//5
		m2(18);
		m2((int)3.3);//narrowing double to int
		m2('A');//widening char to int

	}

}
