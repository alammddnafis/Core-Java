package com.recursionProgram_practice;

public class palindrome {
public static void main(String[] args)
{
	int n=1215;
	 if(n==ispal(n,0))
		 System.out.println(n+" is palindrome");
	 else
		 System.out.println(n+" is not palindrome");

	
}
public static int ispal(int n,int rev)
{
	if(n==0)
		return rev;
	return ispal(n/10,rev=(rev*10)+n%10);
}
}
