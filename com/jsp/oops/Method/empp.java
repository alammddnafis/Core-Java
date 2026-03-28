package com.jsp.oops.Method;

public class empp {
String name;
int id;
int age;
public void add(String n,int i,int a)
{
	name=n;
	id=i;
	age=a;
}

public void display()
{
	System.out.println(name+" "+id+" "+age);
}

public static void main(String[] args)
{
	empp e1=new empp();
	empp e2=new empp();
	
	e1.add("nafis", 1, 25);
	e2.add("naj", 2, 28);
	
	e1.display();
	e2.display();
}
}
