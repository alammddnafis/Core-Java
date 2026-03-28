package com.Two_dArray;

import java.util.Arrays;

public class SumOf2Arr {

	public static void main(String[] args) {
		int[][] a= {{1,2},{2,1}};
		int[][] b= {{1,3},{4,2}};
		int[][] c=new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int[] num:c)
		{
			System.out.println(Arrays.toString(num));
		}

	}

}
