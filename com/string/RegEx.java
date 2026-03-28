package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
public static void main(String[] args)
{
	Pattern p=Pattern.compile("an");
	Matcher m=p.matcher("banana");
	int count=0;
	while(m.find())
	{
		count++;
		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
		System.out.println("......................");
	}
	System.out.println("total count is:"+count);
}
}
