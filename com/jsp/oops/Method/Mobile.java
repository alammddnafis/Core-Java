package com.jsp.oops.Method;

public class Mobile {

	static String comp;
	String name;
	String color;
	public static void main(String[] args)
	{
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		Mobile m3=new Mobile();
		
		m1.comp="Apple";
		m1.name="Iphone8";
		m1.color="black";
		
		m2.name="Iphone9";
		m2.color="white";
	
		m3.name="Iphone12";
		m3.color="red";
		
		System.out.println(m1.comp+"  "+m1.name+"  "+m1.color);
		System.out.println(m2.comp+"  "+m2.name+"   "+m2.color);
		System.out.println(m3.comp+" "+m3.name+"   "+m3.color);
	}
}
