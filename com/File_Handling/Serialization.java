package com.File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Student s=new Student("Rohan",29,1);
		
		FileOutputStream f=new FileOutputStream("C:\\Users\\shada\\OneDrive\\Desktop\\fExa\\E.txt");
		ObjectOutputStream of=new ObjectOutputStream(f);
		of.writeObject(s);
		System.out.println("Serilization done");
		of.close();
	}

}
