package com.inheritance;
class A
{
	int i=10;
	public void m1()
	{
		System.out.println("m1()-A");
	}
}

class B extends A
{
	int j=20;
	public void m2()
	{
		System.out.println("m2()-B");
	}
}
public class test {
	public static void main(String[] args)
	{
		A a=new A();
		System.out.println(a.i);
		//System.out.println(a.j);//CTE
		a.m1();
		//a.m2();//CTE
		
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		b.m2();
	}

}
