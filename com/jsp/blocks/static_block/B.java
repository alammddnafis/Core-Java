package com.jsp.blocks.static_block;

public class B {
static int i;
static
{
	i=10;
}

public static void main(String[] args)
{
	System.out.println(i);
}

static 
{
	i=30;
}

static
{
	int i=20;
}
}
