package com.Two_dArray;

public class EvennoIn2dArray {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		for(int[] n:a) {
			for(int num:n)
			{
				if(num%2==0)
					System.out.print(num);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		}

	}


