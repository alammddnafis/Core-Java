package com.constructor.supercall;
class AA
{
	static
	{
		System.out.println("Static block-1-AA");
	}
	
	{
		System.out.println("Non-static block-2-AA");
	}
	
	AA()
	{
		System.out.println("AA()-cons");
	}
}

class BB extends AA
{
	static
	{
		System.out.println("Static block-1-BB");
	}
	
	{
		System.out.println("Non-static block-2-BB");
	}
	
	BB()
	{
		System.out.println("BB()-cons");
	}
	
}
public class Demo {
public static void main(String[] args)
{
	new BB();
}
}
