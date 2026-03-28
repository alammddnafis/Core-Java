package com.interfaces;
interface I
{	
	void m1();//public abstract void m1()
}

interface II extends I
{
	void m2();//public abstract void m2()
}

 abstract class BB implements II
{
	@Override
	public void m1()
	{
		System.out.println("m1()-B");
	}

}

class C extends BB
{

	@Override
	public void m2() {
		System.out.println("m2()-C");
	}

}
public class Demo1 {
public static void main(String[] args)
{
//	I1 i=new B();//CTE
	I i1=new C();
	i1.m1();
//	i1.m2();//CTE
	II i2=new C();
	i2.m1();
	i2.m2();
}
}
