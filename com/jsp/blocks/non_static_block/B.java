package com.jsp.blocks.non_static_block;

public class B {
int i;
int j;

{
	i=10;
	j=20;
}

{
	j=30;
}

public static void main(String[] args)
{
	System.out.println("Main Starts");
	B b=new B();
	System.out.println(b.i+" "+b.j);
	System.out.println("Main ends");
}

{
	i=40;
}
}
