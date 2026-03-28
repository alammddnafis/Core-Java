package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
	public static void main(String[] args)
	{
		String exp="a[^0-9]";
		String s="a1a5ab";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
