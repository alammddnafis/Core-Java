package com.StringPractice;

public class AllPalindrome {

	public static void main(String[] args) {
		String s="banana";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(isPalind(s,i,j))
				{
					System.out.println(s.substring(i,j+1));
				}
			}
		}

	}
	public static boolean isPalind(String s,int st,int end)
	{
		while(st<end)
		{
			if(s.charAt(st)!=s.charAt(end))
				return false;
			st++;
			end--;
		}
		return true;
	}

}
