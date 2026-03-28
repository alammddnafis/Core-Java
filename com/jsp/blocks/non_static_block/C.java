package com.jsp.blocks.non_static_block;

public class C {
int i;
static int j;

{
	i=10;
	j=20;
}

{
	i=35;
	j=30;
}

public static void main(String[] args)
{
	System.out.println("Main starts");
	System.out.println(j);//0
	C b=new C();
	System.out.println(b.i+" "+b.j);//40 50
	System.out.println("Main ends");
}

{
	j=50;
	i=40;
}
}
