package com.interfaces;
interface i1
{
	void m1();
}
interface i2
{
	void m2();
}
abstract class aa
{
	public void m1()
	{
		System.out.println("m1()-A");
	}
	abstract void m3();
}
class bb extends aa implements i1,i2
{

	@Override
	public void m2() {
		System.out.println("m2()-B");
		
	}

	@Override
	void m3() {
		System.out.println("m3()-B");
		
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		i1 I1=new bb();
		I1.m1();
		i2 I2=new bb();
		I2.m2();
		
		aa A=new bb();
		A.m1();
//		A.m2();//CTE
		A.m3();

		
	}

}
