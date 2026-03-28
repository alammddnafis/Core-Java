package com.StringPractice;

public class rev {
		public static void main(String[] args)
		{
			String s1="i love java";
			String s2="";
			for(int i=s1.length()-1;i>=0;i--)
			{
				char c=s1.charAt(i);
				if(c!=' ')
				{
					s2=c+""+s2;
				}
				else
				{
					System.out.print(s2+" ");
					s2="";
				}
			}
			System.out.print(s2);
		}
}
