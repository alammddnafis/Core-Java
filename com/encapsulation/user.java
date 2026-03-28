package com.encapsulation;

public class user extends facebook {
public static void main(String[] args)
{
	user u=new user();
	System.out.println(u.getId());
	System.out.println(u.getPass());
	System.out.println("*******************");
	u.setId("nafis@123");
	u.setPass("password");
	System.out.println(u.getId());
	System.out.println(u.getPass());
}


}
