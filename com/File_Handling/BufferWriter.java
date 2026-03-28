package com.File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\shada\\OneDrive\\Desktop\\fExa\\B.txt",true);
		try(BufferedWriter bf=new BufferedWriter(f))
		{
			bf.write("Hello..");
			bf.newLine();
			bf.write("bye");
			bf.newLine();
		}
	}

}
