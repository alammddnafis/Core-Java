package com.interfaces;
interface washable
{
	//marker
}
class car implements washable
{
	
}
class laptop
{
	
}
class bike implements washable
{
	
}
class Mobile
{
	
}
public class Washerman {
public static void wash(Object o)
{
	if(o instanceof washable)
	{
		System.out.println(o.getClass().getSimpleName()+" is washed");
	}
	else
		System.out.println(o.getClass().getSimpleName()+" is not washed");
		
}
public static void main(String[] args)
{
	wash(new car());
	wash(new bike());
	wash(new Mobile());
	wash(new laptop());
	
}
}

