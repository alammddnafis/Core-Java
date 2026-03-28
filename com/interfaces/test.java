package com.interfaces;
interface I4
{
	void m1();
}
interface I5
{
	void m1();
}
class B2 implements I4,I5
{

	@Override
	public void m1() {
		System.out.println("m1()-B");
	}
	
}
public class test {
public static void main(String[] args)
{
	I4 i= new B2();
	i.m1();
	I5 i1= new B2();
	i1.m1();
}
}
