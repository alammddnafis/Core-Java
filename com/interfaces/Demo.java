package com.interfaces;
interface I1
{
	int i=10;//public static final int i=10;
	void m1();//public abstract void m1();
}

class B implements I1
{

	@Override
	public void m1() {
		System.out.println("m1()-B");
		
	}
	
}
public class Demo {
public static void main(String[] args)
{
//	I1=new I1();//CTE
	System.out.println(I1.i);
	I1 i=new B();
	i.m1();
}
}
