package com.abstraction;
abstract class A
{
	abstract public void m1();
}
class B extends A
{
	@Override
	public void m1()
	{
		System.out.println("m1()-B");
	}
}
public class Demo {
public static void main(String[] args)
{
	A b=new B();
	b.m1();
}
}
