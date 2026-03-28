package com.interfaces;
interface I111
{
	default void m1()
	{
		System.out.println("m1()-I1");
	}
}

interface I222
{
	default void m1()
	{
		System.out.println("m1()-I2");
	}
}

abstract class A
{
	public void m1()
	{
		System.out.println("m1()-A");
	}
}

class Bbb1 extends A implements I111,I222
{
	@Override
	public void m1()
	{
		super.m1();
		I111.super.m1();
		I222.super.m1();
		System.out.println("m1()-B");
	}
}

public class Demo3 {
public static void main(String[] args)
{
	new Bbb1().m1();
}
}
