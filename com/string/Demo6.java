package com.string;

public class Demo6 {
public static void main(String[] args)
{
	String s="java Developer";
	System.out.println(s.replace('a', '@'));//j@v@ Developer
	System.out.println(s.replace("java", "python"));//python Developer
	System.out.println(s.replace('x', 'y'));//java developer
	System.out.println(s.replace("java",""));//Developer
}
}
