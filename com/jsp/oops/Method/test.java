package com.jsp.oops.Method;

public class test {
static int i=10;
int j=20;
public static void m1()
{
	System.out.println(i);//10
	//System.out.println(j);//CTE
}

public void m2()
{
	System.out.println(i);//10
	System.out.println(j);//20
	
}

public static void main(String[] args)
{
	test t=new test();
	t.m1();
	t.m2();
}
}
