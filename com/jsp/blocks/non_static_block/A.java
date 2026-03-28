package com.jsp.blocks.non_static_block;

public class A {
	{
		System.out.println("Non-static block-1");
	}
	
	{
		System.out.println("Non-static block-2");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		new A();
		new A();
		System.out.println("Main ends");
	}
	
	{
		System.out.println("Non-static block-3");
	}
}
