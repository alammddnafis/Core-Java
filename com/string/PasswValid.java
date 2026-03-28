package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswValid {

	public static void main(String[] args) {
		String exp="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-z A-Z 0-9]).{4,6}";
		String s="Jsp#12";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("valid passward");
		else
			System.out.println("invalid passward");
	}

}
