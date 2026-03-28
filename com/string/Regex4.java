package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {
		String exp="ab?c";
		String s="acabcabbcabbbc";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group());
		}

	}

}
