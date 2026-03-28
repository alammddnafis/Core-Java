package com.comparableInterface;

public class Emp implements Comparable{
		String name;
		int age;
		int id;
		public Emp(String name, int age, int id) {
			this.name = name;
			this.age = age;
			this.id = id;
		}
		
		@Override
		public String toString()
		{
			return "Emp[name="+name+",age="+age+",id="+id+"]";
		}
		
		@Override
		public int compareTo(Object o)
		{
			Emp e=(Emp)o;
			if(this.age>e.age)
				return 1;
			else if(this.age<e.age)
				return -1;
			
		return 0;
		}
		
}
