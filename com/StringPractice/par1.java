package com.StringPractice;

public class par1 {
		public static void main(String[] args)
		{
			int n=5;
			int a=0;
			int b=1;
			int c=1;
			System.out.println(a);
			System.out.println(b+" "+c+" ");
			a=b;
			b=c;
			for(int i=2;i<n;i++)
			{
				for(int j=i;j>=0;j--)
				{
					c=a+b;
					System.out.print(c+" ");
					a=b;
					b=c;
				}
				System.out.println();
		}
}
}
