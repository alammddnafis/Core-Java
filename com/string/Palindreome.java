package com.string;
class Palindreome {
public static void main(String[] args)
{
	String s="madamm";
	System.out.println(isPalindrome(s));
}
static boolean isPalindrome(String s)
{
	char[] a=s.toCharArray();
	int i=0,j=a.length-1;
	while(i<j)
	{
		if(a[i]!=a[j])
			return false;
		i++;
		j--;
	}
	return true;
}
}
