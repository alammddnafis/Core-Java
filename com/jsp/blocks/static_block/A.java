package com.jsp.blocks.static_block;

public class A {
static
{
	System.out.println("Static block-1");
}

public static void main(String[] args)
{
	System.out.println("Main Executed");
}

static
{
	System.out.println("Static block-2");
}

static
{
	System.out.println("Static block-3");
}
}
