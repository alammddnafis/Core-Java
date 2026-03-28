package com.constructor.supercall;
class A
{
	A(int i)
	{
		System.out.println("A(int i)-cons:"+i);
	}
}

class B extends A
{
	B(int i)
	{
		super(i);
		System.out.println("B(int i)-cons:"+i);
	}
}

class C extends B
{
	C()
	{
		super(20);
	}
}
public class Test {
public static void main(String[] args)
{
	new C();
}
}
