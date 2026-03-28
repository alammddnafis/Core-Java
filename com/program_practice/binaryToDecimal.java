package com.program_practice;

public class binaryToDecimal {
public static void main(String[] args)
{
	int bin=111;
	int dec=0;
	int i=0;
	while(bin>0)
	{
		int bit=bin%10;
		dec+=bit*Math.pow(2, i);
		i++;
		bin/=10;
		
	}
	System.out.println(dec);
}
}
