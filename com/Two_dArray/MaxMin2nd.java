package com.Two_dArray;

public class MaxMin2nd {
public static void main(String[] args)
{
	int[][] a= {{0,5,6},
				{9,8,7},
				{3,8,2}};
	int max1=0;//5 6 9
	int max2=0;//4 5 6
	int min1=Integer.MAX_VALUE;
	int min2=a[0][0];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(a[i][j]>max1)
					{
						max2=max1;
						max1=a[i][j];	
					}
					else if(a[i][j]>max2)
						max2=a[i][j];
					if(min1>a[i][j])
					{   
						min2=min1;
						min1=a[i][j];
					}
					else if(min2>a[i][j])
					{
						min2=a[i][j];
					}
				}
	}
			System.out.println(max1);
			System.out.println(max2);
			System.out.println("**************************");
			System.out.println(min1);
			System.out.println(min2);
}
}
