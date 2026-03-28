package com.File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutStream {

	public static void main(String[] args) throws IOException {
		try(FileOutputStream f=new FileOutputStream("C:\\Users\\shada\\OneDrive\\Desktop\\fExa\\D.txt"))
		{
		String s="MIss U All";
		byte[] bytes=s.getBytes();
		System.out.println(Arrays.toString(bytes));
		f.write(bytes);
	}
}

}
