package com.ArrayProg;

public class LinearSearch1 {

	public static void main(String[] args) {
		int[] a= {4,5,6,3,2,7};
		int key=70;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
			System.out.println(i);
			return;
			}
		}
		System.out.println(-1);

	}

}
