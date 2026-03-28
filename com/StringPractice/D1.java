package com.StringPractice;

public class D1 {

	public static void main(String[] args) {
		String s="nafis";
		char[] c=s.toCharArray();
		for(char ch:c)
		{
			System.out.println(ch);
		}
		System.out.println("*****************");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

		System.out.println("*****************");
		for(int j=0;j<s.length();j++)
		{
			System.out.println(s.charAt(j));
		}
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	}

}
