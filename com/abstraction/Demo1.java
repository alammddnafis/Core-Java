package com.abstraction;
abstract class AA
{
	abstract public void m1();
	abstract public void m2();
}
abstract class BB extends AA
{

	@Override
	public void m1() {
		System.out.println("m1()-B");
		
	}	
}
class CC extends BB
{
	@Override
	public void m2()
	{
		System.out.println("m1()-c");
	}
}

public class Demo1 {
public static void main(String[] args)
{
	AA a=new CC();
	a.m1();
	a.m2();
}
}
