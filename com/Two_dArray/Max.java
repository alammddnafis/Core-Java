package com.Two_dArray;

public class Max {

	public static void main(String[] args) {
		int[][] a= {{1,2},
					{6,8},
					{3,9}};
		int max=0;
		int min=a[0][0];
		for(int[] n:a)
		{
			for(int num:n)
			{
				if(num>max)
					max=num;
			    if(num<min)
			    	min=num;
			}
		}
		
		
		System.out.println(max);
		System.out.println(min);

	}

}
