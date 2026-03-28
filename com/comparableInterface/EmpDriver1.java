package com.comparableInterface;

import java.util.Arrays;

public class EmpDriver1 {

	public static void main(String[] args) {
		Emp1 e1=new Emp1(1,"Nafis",25);
		Emp1 e2=new Emp1(2,"Naj",27);
		Emp1 e3=new Emp1(3,"Nagma",30);
		Emp1 e4=new Emp1(4,"Chand",28);
		Emp1 e5=new Emp1(4,"Chand",28);

		Emp1[] e= {e1,e2,e3,e4};
		Arrays.sort(e);
		for(Emp1 emp:e)
			System.out.println(emp);
		for(Emp1 emp:e)
			System.out.println(emp);
	}

}
