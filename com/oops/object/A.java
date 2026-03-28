package com.oops.object;

public class A {
int i;
static int j;
public static void main(String[] args)
{
	A a=new A();
	a.i=10;
	a.j=10;
	A b=new A();
	b.i=20;
	b.j=20;
	A c=new A();
	c.i=30;
	c.j=30;
	System.out.println(a.i +" "+a.j);
	
	System.out.println(b.i+" "+b.j);
	
	System.out.println(c.i+" "+c.j);
}
}
