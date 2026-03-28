package com.string;

public class revWord {

	public static void main(String[] args) {
		
		String s="I am going";
		String[] arr=s.split(" ");
		String s1="";
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i!=arr.length-1)
			System.out.print(" ");
			System.out.print(arr[i]);
		}
	}

}
