package com.File_Handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSeriloization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f=new FileInputStream("C:\\Users\\shada\\OneDrive\\Desktop\\fExa\\E.txt");
		ObjectInputStream o=new ObjectInputStream(f);
		Student s=(Student) o.readObject();
		System.out.println(s);
		o.close();
	}

}
