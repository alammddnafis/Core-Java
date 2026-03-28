package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobval {

	public static void main(String[] args) {
		String expr="[6789][0-9]{9}";
		String s="8002348759";
		Pattern p=Pattern.compile(expr);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("Mobile no. is valid");
		else
			System.out.println("Mobile no. is invalid");
			
	}

}
