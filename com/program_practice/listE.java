package com.program_practice;

import java.util.ArrayList;
import java.util.List;

public class listE {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		 l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(1);
		 l.add(1);
		 l.add(2); l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(1);
		 l.add(1); l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(2); l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(1);
		 l.add(1);
		 l.add(2); l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(1);
		 l.add(1);
		 l.add(2);
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if (l.get(i).equals(l.get(j))) {
					l.remove(j);
				j--;
			}}
		}
		 System.out.println(l);

	}

}
