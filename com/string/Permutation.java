package com.string;

public class Permutation {

	public static void main(String[] args) {
		String s="abc";
		permutation(s,0,s.length()-1);

	}
	public static void permutation(String s,int st,int end)
	{
		if(st==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=st;i<=end;i++)
		{
			String s1=swap(s,st,i);
		    permutation(s1,st+1,end);
		}
	}
	
	public static String swap(String s,int i,int j)
	{
		char[]c=s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		
		return new String(c);
	}

}
