package com.constructor.supercall;

class phone
{
	String name;
	long num;
	String color;
	
	phone(String name,long num, String color)
	{
		this.name=name;
		this.num=num;
		this.color=color;
	}
}

class smartPhone extends phone
{
	int ram;
	int rom;
	int pxl;
	
	smartPhone(String name,long num, String color,int ram,int rom,int pxl)
	{
		super(name,num,color);
		this.ram=ram;
		this.rom=rom;
		this.pxl=pxl;
	}
	
	public void display()
	{
		System.out.println(name+" "+num+" "+color+" "+ram+" "+rom+" "+pxl);
	}
}
public class MobileDriver {
public static void main(String[] args)
{
	smartPhone s=new smartPhone("oppo",800234875,"black",8,256,48);
	s.display();
}
}
