package com.HasARelationship;

public class Engine {
		int cc;
		public Engine(int cc)
		{
			this.cc=cc;
		}
		@Override
		public String toString() {
			return "Engine [cc=" + cc + "]";
		}	
}

class car
{
	String name;
	int carNum;
	Engine e;
	public car(String name, int carNum, Engine e) {
		this.name = name;
		this.carNum = carNum;
		this.e = e;
	}
	@Override
	public String toString() {
		return "car [name=" + name + ", carNum=" + carNum + ", e=" + e + "]";
	}
	
	
}

class carDriver
{
	public static void main(String[] args)
	{
		car c1=new car("BMW",1234,new Engine(310));
		c1.e.cc=999;
		System.out.println(c1);
	}
}
