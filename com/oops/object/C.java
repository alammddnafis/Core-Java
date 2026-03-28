package com.oops.object;

public class C {
static int i;
int j;
public static void main(String[] args)
{
	C c1=new C();
	C c2=new C();
	
	c1.i=10;
	c2.j=20;
	
	System.out.println(c2.i+" "+c2.j);
	
}
}
