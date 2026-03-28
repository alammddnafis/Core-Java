package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GMailVal {
public static void main(String[] args)
{
	String exp="[a-z][a-z 0-9]+@gmail[.]com";
	String s="nafis@gmail.com";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(s);
	if(m.matches())
		System.out.println("valid G-mail");
	else
		System.out.println("invalid G-mail");
}
}
