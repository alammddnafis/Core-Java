package com.program_practice;

public class Str23 {

	public static void main(String[] args) {
		String s1="eetcode";
		int count=1;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					count++;
			}
			if(count==1)
			{
				System.out.println(s1.charAt(i));
				break;
			}
			count=1;
		}

	}

}
