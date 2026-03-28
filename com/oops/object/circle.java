package com.oops.object;

public class circle {
int radius;
public static void main(String[] args)
{
	circle c1=new circle();
	circle c2=c1;// copy reference or object address
	
	System.out.println(c1);
	
	System.out.println(c2);
	
	c1.radius=10;
	System.out.println(c2.radius);
	
	c2.radius=200;
	System.out.println(c1.radius);
}
}
