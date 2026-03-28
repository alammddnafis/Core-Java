package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add('r');
		l.add("Nafis");
		l.add(true);
		
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.contains('r'));
		l.add(2, "Mock");
		l.set(4, "Java");
		System.out.println(l);
	}

}
