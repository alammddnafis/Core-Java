package com.abstraction;
abstract class Aa
{
	abstract public void m1();
}
class Bb extends Aa
{

	@Override
	public void m1() {
		System.out.println("m1()-BB");
		
	}
	
	public void m2()
	{
		System.out.println("m2()-BB");
	}
	
}
public class Test1 {
public static void main(String[] args)
{
	Aa a=new Bb();
	a.m1();
//	a.m2();//CTE
	Bb b=(Bb)a;
	b.m1();
	b.m2();
	
}
}
