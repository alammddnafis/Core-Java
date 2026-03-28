package com.jsp.this_keyword;

public class Mobile {
String name;
int ram;
int rom;
String color;

public void addMobile(String name,int ram,int rom,String color)
{
	this.name=name;
	this.ram=ram;
	this.rom=rom;
	this.color=color;
}

public void display()
{
	System.out.println(name+" "+ram+" "+rom+" "+color);
}

public static void main(String[] args)
{
	Mobile m=new Mobile();
	m.addMobile("oppo", 8, 256, "black");
	m.display();
}
}
