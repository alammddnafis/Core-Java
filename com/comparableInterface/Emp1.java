package com.comparableInterface;

public class Emp1 implements Comparable {
	String name;
	int age;
	int id;
	
	Emp1(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString()
	{
		return "Emp[name="+name+",age="+age+",id="+id+"]";
	}
	@Override
	public int compareTo(Object o)
	{
		Emp1 e=(Emp1)o;
		if(this.age>e.age)
			return 1;
		else if(this.age<e.age)
			return -1;
	return 0;
	}
}
