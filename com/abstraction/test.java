package com.abstraction;
abstract class a
{
	a()
	{
		System.out.println("A()-cons");
	}
}
abstract class b extends a
{
	
}
class c extends b
{
	
}
public class test {
	public static void main(String[] args)
	{
//a a1=new b();//cte
	b b1=new c();
}
}