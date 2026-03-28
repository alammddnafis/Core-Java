package com.File_Handling;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\shada\\OneDrive\\Desktop\\fExa\\B.txt");
		//System.out.println(f.mkdir());//to create a folder
		//System.out.println(f.createNewFile());//to create new file
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());
		
		File f1=new File("C:\\Users\\shada\\OneDrive\\Desktop\\fExa\\C.txt");
		System.out.println(f.renameTo(f1));
		System.out.println(f1.delete());
	}

}
