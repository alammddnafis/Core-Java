package com.jsp.oops.Method;

public class AA {
static int i;//0 1 2 3
int j;//0 1

public void m1()
{
	i++;
	j++;
}

public static void main(String[] args)
{
	AA a1=new AA();
	AA a2=new AA();
	AA a3=new AA();
	a1.m1();//1 1
	a2.m1();//2 1
	a3.m1();//3 1
	
	System.out.println(a1.i+" "+a1.j);// 3 1
	System.out.println(a2.i+" "+a2.j);// 3 1
	System.out.println(a3.i+" "+a3.j);// 3 1
}
}
