package com.pattern;

public class p19 {
public static void main(String[] args)
{
	int n=7;
	int st=1;  //1 2 3  4 3 2
	int sp=n-2;//5 3 1 -1 1 3
	for(int i=1;i<=n;i++)//1 2 3 4
	{
		if(i==n/2+1)
		{
			for(int j=n;j>0;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
			 st--;
             sp += 2;
			continue;
		}
			for(int j=st;j>0;j--)
			{
				System.out.print(" *");
			}
			for(int k=sp;k>0;k--)
			{
				System.out.print("  ");
			}
			for(int j=st;j>0;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
			if (i <= n / 2) {
                st++;
                sp -= 2;
            } else {
                st--;
                sp += 2;
            }
	}
}
}

