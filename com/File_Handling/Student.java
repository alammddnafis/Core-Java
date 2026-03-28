package com.File_Handling;

import java.io.Serializable;

public class Student implements Serializable{
		String name;
		int age;
		int rollno;
		public Student(String name, int age, int rollno) {
			this.name = name;
			this.age = age;
			this.rollno = rollno;
		}
		
		
}
