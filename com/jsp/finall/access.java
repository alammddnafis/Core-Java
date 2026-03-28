package com.jsp.finall;
class z{
    // private static int a=20;
     protected static int b=30;
	 public static int c=40;	 
}
public class access extends z{
public static void main(String[] args)
{
	//System.out.println(a);//private will access only within a class
	System.out.println(b);
	System.out.println(c);
}
}
