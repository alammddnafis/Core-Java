package com.PremitiveTypeCasting;

public class Narrowing {

	public static void main(String[] args) {
		double d=12.34;
		int a=(int)d;//narrowint double to int
		System.out.println(d+"        "+a);
		
		int n=150;
		byte b=(byte)n;
		System.out.println(n+"     "+b);//data lost

		
		int num=98;
		char c=(char)num;
		System.out.println(num+"    "+c);
	}

}
