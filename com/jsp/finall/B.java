package com.jsp.finall;

public class B {
final int i;
B(int i)
{
	this.i=i;
}
public static void main(String[] args)
{
	B b=new B(10);
	System.out.println(b.i);//10
	//b.i=30;//CTE
	 B b1=new B(40);
	 System.out.println(b1.i);//40
}

}
