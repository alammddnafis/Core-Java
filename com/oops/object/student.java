package com.oops.object;

public class student {
String name;
int id;
int age;
static String team;
public static void main(String[] args)
{
	student s1=new student();
	student s2=new student();
	student s3=new student();
	
	s1.name="virat";
	s1.id=18;
	s1.age=37;
	s1.team="RCB";
	
	s2.name="THALA";
	s2.id=7;
	s2.age=38;
	
	s3.name="Hitman";
	s3.id=45;
	s3.age=39;
	
			System.out.println(s1.name+" "+s1.id+" "+s1.age+" "+s1.team);
			System.out.println(s2.name+" "+s2.id+" "+s2.age+" "+s2.team);
			System.out.println(s3.name+" "+s3.id+" "+s3.age+" "+s3.team);
}
}
