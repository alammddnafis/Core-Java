package com.string;

public class Strirev {
public static void main(String[] args)
{
	String s1="Developer";
	char[] a=s1.toCharArray();
	int i=0;
	int j=a.length-1;
	while(i<j)
	{
		char c=a[i];
		a[i]=a[j];
		a[j]=c;
		i++;
		j--;
	}
	String s2=new String(a);
	System.out.println(s2);
}
}
