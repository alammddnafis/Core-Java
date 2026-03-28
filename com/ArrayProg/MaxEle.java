package com.ArrayProg;

public class MaxEle {

	public static void main(String[] args) {
		int[] a= {5,3,8,0,1,4};
		int max=0;
		for(int num:a)
		{
			if(num>max)
				max=num;
		}
		System.out.println(max);
	}

}
