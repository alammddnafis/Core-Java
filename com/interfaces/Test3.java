package com.interfaces;
interface I6
{
	void m1(); //abstract public void m1()
	default void m2()//default public void m2()
	{
		System.out.println("M2()-I6");
	}
	
	public static void m3()
	{
		System.out.println("M3()-I6");
	}
}

class Bbb implements I6
{

	@Override
	public void m1() {
		System.out.println("M1()-Bbb");
		
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		I6 i=new Bbb();
		i.m1();
		i.m2();
//		i.m3();//CTE
		I6.m3();

	}

}
