package com.interfaces;
@FunctionalInterface
interface Payble
{
	void pay();
}

class Upi implements Payble
{

	@Override
	public void pay() {
		System.out.println("Paid bu using UPI");
		
	}
	
}
class CreditCard implements Payble
{

	@Override
	public void pay() {
		System.out.println("Paid by using CreditCard");
		
	}
	
}

class NetBanking implements Payble
{

	@Override
	public void pay() {
		System.out.println("Paid by using NetBanking");
		
	}
	
}
public class PayDriver {
	public static void Sent(Payble p)
	{
		p.pay();
	}
public static void main(String[] args)
{
	Sent(new CreditCard());
}
}
