package com.jsp.oops.Method;

public class emp {
String name;
int id;
int age;
public void display()
{
	System.out.println(name+" "+id+" "+age);
}
public static void main(String[] args)
{
	emp e1=new emp();
	emp e2=new emp();
	
	e1.name="nafis";
	e1.id=1;
	e1.age=25;
	
	e1.display();//nafis 1 25
	e2.display();//null 0 0
}
}
