package CompratorProject;

import java.util.Arrays;
import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile[]m=null;
		boolean b=true;
		do {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add\n2.sort \n3.Didplay \n4.Exit");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("How many Mobile You want to add");
				int num=sc.nextInt();
				m=new Mobile[num];
				for(int i=0;i<m.length;i++)
				{
					System.out.println("Enter Name Ram Rom Color Price");
					String name=sc.next();
					int ram=sc.nextInt();
					int rom=sc.nextInt();
					String color=sc.next();
					Double price=sc.nextDouble();
					Mobile mobile=new Mobile(name,ram,rom,color,price);
					m[i]=mobile;
					
				}
			}break;
			
			case 2:
			{
				System.out.println("1.SortByName");
				System.out.println("2.SortByRam(low to high)");
				System.out.println("3.SortByRam(high to low)");
				System.out.println("4.SortByRom(low to high)");
				System.out.println("5.SortByRom(high to high)");
				System.out.println("6.SortByColor");
				System.out.println("7.SortByPrice(low to high)");
				System.out.println("8.SortByPrice(high to low)");
				int num=sc.nextInt();
				if(num==1)
				{
					Arrays.sort(m,new SortByName());
					for(Mobile name:m)
					{
						System.out.println(name);
					}
					
				}
				else if(num==2)
				{
					Arrays.sort(m,new SortByRamLH());
					for(Mobile mobile:m)
					{
						System.out.println(mobile);
					}
				}
				else if(num==3)
				{
					Arrays.sort(m,new SortByRamHl());
					for(Mobile mobile:m)
					{
						System.out.println(mobile);
					}
				}
				else if(num==4)
				{
					Arrays.sort(m,new SortByRomLH());
					for(Mobile mobile:m)
					{
						System.out.println(mobile);
					}
				}
				else if(num==5)
				{
					Arrays.sort(m,new SortByRomHL());
					for(Mobile mobile:m)
					{
						System.out.println(mobile);
					}
				}
				else if(num==6)
				{
					Arrays.sort(m,new SortByColor());
					for(Mobile mobile:m)
					{
						System.out.println(mobile);
					}
				}
				else if(num==7)
				{
					Arrays.sort(m,new SortByRomLH());
					for(Mobile mobile:m)
					{
						System.out.println(mobile);
					}
				}
				else if(num==8)
				{
					Arrays.sort(m,new SortByPriceHL());
					for(Mobile mobile:m)
					{
						System.out.println(mobile);
					}
				}
				else
					System.out.println("Invalid choice");
				
			}break;
			
			case 3:
			{
				for(int i=0;i<m.length;i++)
				{
					System.out.println(m[i]);
				}
			}break;
			
			case 4:
			{
				System.out.println("Thanku visit again");
				b=false;
			}break;
		}
			
		}while(b);
		

}
}
