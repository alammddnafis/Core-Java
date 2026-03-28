package com.File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\shada\\OneDrive\\Desktop\\fExa\\A.txt");
		FileWriter f=new FileWriter(file);
		if(file.canWrite())
		{
			f.write("JSPIDER\n");
			f.write("PYSPIDER\n");
			f.write("QSPIDER");
		}
		else
			System.out.println("can't write");
		f.close();
	}

}
