package com.string;

public class StringObj {

	public static void main(String[] args) {
		String s1=new String("Maa");
		String s2=new String("Maa");
		String s3="Maa";
		String s4="Maa";
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println("................");
		System.out.println(s1==s2);//false
		System.out.println(s3==s4);//true

	}

}
