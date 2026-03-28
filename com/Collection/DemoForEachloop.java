package com.Collection;

import java.util.LinkedList;

public class DemoForEachloop {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		for(Object list:l)
		{
			System.out.println(list);
		}
	}

}
