package com.string;

public class ReverseWord {

	public static void main(String[] args) {
		String s1="me love java";
		String s2="";
		String[] str=s1.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			s2+=str[i];
			if(i!=0)
			  s2+=" ";	
		}
		System.out.println(s2);
	}

}
