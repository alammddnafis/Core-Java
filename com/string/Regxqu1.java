package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regxqu1 {
	public static void main(String[] args)
	{
	String exp="a[0-9]{2}c";
	String s="a35cabbca1234c";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(s);
	while(m.find())
	{
		System.out.println(m.group());
	
	}
	}
}
