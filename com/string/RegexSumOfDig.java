package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSumOfDig {
public static void main(String[] args)
{
	String exp="[0-9]+";
	String s="ab12cd345e";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(s);
	int sum=0;
	while(m.find())
	{
		sum+=Integer.parseInt(m.group());
		System.out.println(m.group());
	}
	System.out.println(sum);
}
}
