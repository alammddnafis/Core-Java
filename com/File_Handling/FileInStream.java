package com.File_Handling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInStream {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\shada\\OneDrive\\Desktop\\fExa\\D.txt");
		int n=f.read();
		while(n!=-1)
		{
			System.out.println((char)n);
			n=f.read();
		}
		f.close();

	}

}
