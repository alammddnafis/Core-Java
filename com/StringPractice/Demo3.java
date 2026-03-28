package com.StringPractice;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
//		String s="java developer";
//		System.out.println(s.startsWith("java"));
//		System.out.println(s.endsWith("0per"));
//		s=s.concat(" Nafis");
//		System.out.println(s);
//		System.out.println(s.contains("java"));
//		System.out.println(s.indexOf('e'));
//		System.out.println(s.lastIndexOf('e'));
//		System.out.println(s.substring(5));
//		System.out.println(s.substring(5,15));
//		String a="Raju";
//		String b="raju";
//		String c=new String("Raju");
//		System.out.println(a==c);
//		System.out.println(a.equals(c));
//		System.out.println(a==b);
//		System.out.println(a.equals(b));
//		System.out.println(a.equalsIgnoreCase(b));
//		
//		for(int i=0;i<a.length();i++)
//		{
//			System.out.print(a.charAt(i));
//		}
//		
//		System.out.println();
//		
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			System.out.print(a.charAt(i));
//		}/
		
//		String s1="banana";
//		String s2;
//		while(s1.length()>0)
//		{
//			char c=s1.charAt(0);
//			s2=s1.replace(c+"","");
//			int n=s1.length()-s2.length();
//			System.out.println(c+"-"+n+" times");
//			s1=s2;
//		}
//		String s="madhubani";
//		char[] a=s.toCharArray();
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
//			{
//				count++;
//			}
//		}
//		System.out.println(count);

		
		
//		int n=5;
//		int row=0;
//		int col=-1;
//		int[][] a=new int[n][n];
//		char dir='r';
//		for(int i=1;i<=n*n;i++)
//		{
//			switch(dir)
//			{
//			case 'r':{
//				col++;
//				a[row][col]=i;
//				if(col==a.length-1 || a[row][col+1]!=0)
//					dir='d';
//			}break;
//			
//			case 'd':{
//				row++;
//				a[row][col]=i;
//				if(row==a.length-1 || a[row+1][col]!=0)
//					dir='l';
//			}break;
//			
//			case 'l':{
//				col--;
//				a[row][col]=i;
//				if(col==0 || a[row][col-1]!=0)
//					dir='u';
//			}break;
//			
//			case 'u':{
//				row--;
//				a[row][col]=i;
//				if(a[row-1][col]!=0)
//					dir='r';
//			}break;
//			}
//		}
//		
//		for(int[] num:a)
//		{
//			for(int n1:num)
//			{
//				System.out.print(n1+"\t");
//			}
//			System.out.println();
//		}
		
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
	
//		
//		        int[]a={4,3,2,6,0,4,5};
//		        sort(a,0,a.length-1);
//		    
//		    
//		    public static void sort(int[] a,int st,int end)
//		    {
//		        
//		        int[] left=new left[a.length/2];
//		        int[] right=new right[a.length-left.length];
//		        
//		        for(int i=0;i<left.length;i++)
//		        {
//		            left[i]=a[i];
//		        }
//		        System.out.println(Arrays.toString(left));
//		        for(int j=0;j<right.length;j++)
//		        {
//		            right[j]=a[left.length+j];
//		        }
//		        
//		  
//	}

		
		
		
		int st=1;
		int end=1000;
		for(int i=st;i<=end;i++)
		{
			isAutomorphic(i);
		}
				
}
	
	public static void isAutomorphic(int n)
	{
		int temp=n;
		int sq=n*n;
		int div=1;
		while(n>0)
		{
			div*=10;
			n/=10;
		}
		n=temp;
		if(sq%div==n)
			System.out.println(n);
		
		
	}
}
