package com.string;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s="java is very very easy java";
		String[] str=s.split(" ");
		String res="";
		for(int i=0;i<str.length;i++)
		{
			if(!res.contains(str[i]))
				res+=str[i]+" ";
		}
		System.out.println(res.trim());
		
	}

}
