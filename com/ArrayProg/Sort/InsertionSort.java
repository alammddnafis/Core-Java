package com.ArrayProg.Sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a= {6,5,4,8,9,0,1,1};
		sort(a);
		System.out.println(Arrays.toString(a));

	}

	public static void sort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			int key=a[i];
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
