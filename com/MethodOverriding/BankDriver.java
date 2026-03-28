package com.MethodOverriding;
class Bank
{
	int rateOfInt()
	{
		return 0;
	}
}

class SBI extends Bank
{
	@Override
	int rateOfInt()
	{
		return 11;
	}
}

class ICICI extends Bank
{
	protected int rateOfInt()
	{
		return 12;
	}
}

class AXIS extends Bank
{
	public int rateOfInt()
	{
		return 10;
	}
}
public class BankDriver {
public static void main(String[] args)
{
	Bank b=new Bank();
	SBI s=new SBI();
	ICICI i=new ICICI();
	AXIS a=new AXIS();
	System.out .println("Bank rate of intrest is:"+b.rateOfInt());
	System.out .println("SBI-Bank rate of intrest is:"+s.rateOfInt());
	System.out .println("ICICI-Bank rate of intrest is:"+i.rateOfInt());
	System.out .println("AXIS-Bank rate of intrest is:"+a.rateOfInt());
}
}
