package com.StringPractice;

public class A {
		int i;
		int j;
		int k;
		A(int i,int j)
		{
			this.i=i;
			this.j=j;
		}
		
		
		@Override
		public String toString() {
			return "A [i=" + i + ", j=" + j + "]";
		}
		@Override
		public boolean equals(Object o) {
			A a=(A)o;
	        return this.i==a.i && this.j==a.j;
	    }

		public static void main(String[] args)
		{
			A a1=new A(10,20);
			System.out.println(a1);
			A a2=new A(10,20);
			System.out.println(a1.equals(a2));
//			System.out.println(a1.i);//10
//			System.out.println(a1.j);//20
//			System.out.println(a1.k);//0
			
		}
}
