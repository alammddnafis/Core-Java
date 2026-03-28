package com.File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("D:\\JAVA WORKSPACE\\BASIC\\conditional_statement\\electricity_bill.java");
		try(BufferedReader bf=new BufferedReader(f))
		{
		String s=bf.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=bf.readLine();
		}
		}
	}

}
