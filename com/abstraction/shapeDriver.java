package com.abstraction;
abstract class Shape
{
	String color;
	public Shape(String color)
	{
		this.color=color;
	}
	abstract public void getArea();
	public abstract void display();
}
class Rectangle extends Shape
{
	int length;
	int breadth;
	public  Rectangle(String color,int length,int breadth)
	{
		super(color);
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public void getArea() {
		System.out.println(length*breadth);		
	}
	@Override
	public void display() {
		System.out.println("color:"+color);
		System.out.println("length:"+length);
		System.out.println("breadth:"+breadth);
	}
	
}

class circle extends Shape
{
	int radius;
	public circle(String color,int radius)
	{
		super(color);
		this.radius=radius;
	}
	@Override
	public void getArea() {
		System.out.println(3.14*(radius*radius));
		
	}
	@Override
	public void display() {
		System.out.println("Radius:"+radius);
		System.out.println("color:"+color);
		
	}
	
}
public class shapeDriver {
public static void main(String[] args)
{
	Shape s;
	s=new Rectangle("black",10,20);
	s.getArea();
	s.display();
	System.out.println("________________________________");
	s=new circle("white",10);
	s.getArea();
	s.display();
}
}
