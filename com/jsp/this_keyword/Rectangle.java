package com.jsp.this_keyword;

public class Rectangle {

	int length;
	int breadth;
	public void init(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area()
	{
		System.out.println(this.length*this.breadth);
	}
	
	public void perimeter()
	{
	int res=2*(length+breadth);
	System.out.println(res);
	}
	
	public void display()
	{
		System.out.println("length:"+length);
		System.out.println("breadth:"+breadth);
	}
	
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.init(5,10);
		r.area();
		r.perimeter();
		r.display();
	}
}
