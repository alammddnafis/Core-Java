package com.Two_dArray;

public class SumDiaUsingSingleLoop {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},
			    {3,1,4},
			    {6,5,1}};
	    int sum=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	sum+=a[i][i];
	    	if(i!=a.length-i)
	    	{
	    		sum+=a[i][a.length-1-i];
	    	}
	    	System.out.println(sum);
	    }

	}

}
