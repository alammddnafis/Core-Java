package com.StringPractice;

public class Student {
	String name;
	int age;
	int id;
	Student(String name,int age,int id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	@Override
	public String toString()
	{
		return name+" "+age+" "+id;
	}
	
	public boolean equals(Object o)
	{
		Student s=(Student)o;
		return this.name==s.name && this.age==s.age && this.id==s.id;
	}
	public static void main(String[] args) {
		Student s1=new Student("Nafis",25,101);
		Student s2=new Student("Nafis",25,101);
		System.out.println(s1.equals(s2));

	}

}
