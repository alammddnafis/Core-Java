package com.ArrayProg.Sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {2,9,2,8,4,10};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min_index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min_index])
					min_index=j;
			}
			int temp=a[i];
			a[i]=a[min_index];
			a[min_index]=temp;
		}
	}

}
