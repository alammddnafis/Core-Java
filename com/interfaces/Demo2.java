package com.interfaces;
interface I11
{
	void m1();
}

interface I22 extends I11
{
	void m1();
}

class Bb implements I22
{

	@Override
	public void m1() {
		System.out.println("m1()-B");	
	}
	
	public void m2()
	{
		System.out.println("m2()-B");	
	}
	
}
public class Demo2 {
public static void main(String[] args)
{
	
	I11 i1=new Bb();//upcasting(B to I1)
	i1.m1();
	I22 i2=new Bb();//upcasting(B to I2)
	i2.m1();
//	i2.m2();//CTE
	Bb b=(Bb)i1;//downcasting(I1 to B)
	Bb b1=(Bb)i2;//dowencasting(I2 to B)
	b.m1();
	b.m2();
	b1.m1();
	b1.m2();
}
}
