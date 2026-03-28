package com.Two_dArray;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[][] a=new int[3][];
		a[0]=new int[1];
		a[1]=new int[3];
		a[2]=new int[2];
		
			a[0][0]=10;
			a[1][0]=20;
			a[1][1]=30;
			a[1][2]=40;
			a[2][0]=50;
			a[2][1]=60;
			//a[2][2]=70;
			for(int[] n:a)
			{
				System.out.println(Arrays.toString(n));
			}
	}
}
