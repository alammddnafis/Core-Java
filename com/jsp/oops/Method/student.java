package com.jsp.oops.Method;

public class student {
String name;
int id;
int age;

public void display()
{
	student s=new student();
	System.out.println(s.name+" "+s.id+" "+s.age);//null 0 0
	System.out.println(name+" "+id+" "+age);//gajala 1 26
}
public static void main(String[] args)
{
	student s1=new student();
	s1.name="gajala";
	s1.id=1;
	s1.age=26;
	s1.display();
}
}
