package com.ArrayProg;

public class Demo3 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int count=0;
		for(int num:a)
		{
//			if(num%2==0)
//				System.out.println(num);
			if(num%2!=0)
				count++;
//				System.out.println(num);
		}
		System.out.println(count);

	}

}
