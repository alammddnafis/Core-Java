package com.program_practice;

public class CountDuplicate {
		public static void main(String[] args) {
			int[]a= {1,1,2,2,3,3,3};
			System.out.println(Duplicate(a));
			
		}
		public static int Duplicate(int[]a) {
			int i=1;
			for(int j=1;i<a.length;j++) {
				if(a[j]!=a[i-1]) {
					a[j]=a[i];
					i++;
				}
			}
			return i;
			
		}
}
