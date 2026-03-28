package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {

	public static void main(String[] args) {
		String exp="[ab]c";
		String s="acbcdc";
		Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find())
        {
        	System.out.println(m.group());
        }
	}

}
