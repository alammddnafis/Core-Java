package com.ArrayProg;

public class SecondMinimum {

	public static void main(String[] args) {
		int[] a= {9,3,1,9,8,5,2};
		int min1=a[0];//9 3 1
		int min2=0;   //0 9 3
		
		for(int i=0;i<a.length;i++)
		{   if(a[i]==min1)
			continue;
		
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2)
				min2=a[i];
		}
		System.out.println(min1);
		System.out.println(min2);
	}

}
