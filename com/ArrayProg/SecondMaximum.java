package com.ArrayProg;

public class SecondMaximum {

	public static void main(String[] args) {
		int[] a= {9,3,1,9,8,5,2};
		int max1=0;//5 8 9
		int max2=0;//0 5 8
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==max1)
				continue;
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			
			else if(a[i]>max2)
				max2=a[i];	
			
		}
		System.out.println(max1);
		System.out.println(max2);

	}

}
