package com.ArrayProg;

public class BinarySearUsRecursion2 {

	public static void main(String[] args) {
		int[] a= {2,4,6,8,9,9};
		System.out.println(find(a,9,0,a.length-1));
	}
	
	public static int find(int[] a,int key,int st,int end)
	{
		if(st>end)
			return -1;
		int mid=(st+end)/2;
		if(key==a[mid])
			return mid;
		else if(key<a[mid])
			return find(a,key,0,mid-1);
		else
			return find(a,key,mid+1,end);
	}

}
