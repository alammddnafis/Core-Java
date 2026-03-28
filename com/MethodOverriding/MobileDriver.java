package com.MethodOverriding;
class phone
{
	public void call()
	{
		System.out.println("Voice call");
	}
}
class smartPhone extends phone
{   
	@Override
	public void call()
	{
		System.out.println("HD-Voice call");
	}
	
	public void search()
	{
		System.out.println("Normal-Searching java");
	}
		
}

class flipSmart extends smartPhone
{   
	@Override
	public void search()
	{
		System.out.println("Safe-Searching java");
	}
		
}
public class MobileDriver {
	public static void main(String[] args)
	{
	phone p=new phone();
	p.call();
	
	smartPhone s=new smartPhone();
	s.call();
	s.search();
	
	flipSmart f=new flipSmart();
	f.call();
	f.search();
	}
}
