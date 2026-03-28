package com.StringPractice;

public class ReverseEachWord {
public static void main(String[] args)
{
	String s="I love java and java loves me";
	String str="";
	char[] a=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		if(a[i]!=' ' )
		{
			str+=a[i]+"";
		}
		else
		{
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
			str="";
		}
	}
	
	for(int j=str.length()-1;j>=0;j--)
	{
		System.out.print(str.charAt(j));
	}
}
}
