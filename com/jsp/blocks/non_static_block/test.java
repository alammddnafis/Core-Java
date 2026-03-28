package com.jsp.blocks.non_static_block;

public class test {
static
{
	new test();
	System.out.println("Static block-1");
}

{
	System.out.println("Non-static block-1");
}

public static void main(String[] args)
{
	System.out.println("Main starts");
	new test();
	System.out.println("Main ends");
}

{
	System.out.println("Non-static block-2");
}

static
{
	System.out.println("Static block-2");
}
}
