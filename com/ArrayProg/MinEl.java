package com.ArrayProg;

public class MinEl {

	public static void main(String[] args) {
		int[] a= {5,3,8,0,1,4};
		int min=a[0];
		for(int num:a)
		{
			if(num<min)
				min=num;
		}
		System.out.println(min);
	}

}
