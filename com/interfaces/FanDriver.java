package com.interfaces;
interface Switch
{
 void on();
 void off();
}
interface Regulator
{
	void incSpeed();
	void decSpeed();
}

class Fan implements Switch,Regulator
{

	@Override
	public void incSpeed() {
		System.out.println("speed increased");
		
	}

	@Override
	public void decSpeed() {
		System.out.println("speed decresed");
		
	}

	@Override
	public void on() {
		System.out.println("fan on");
		
	}

	@Override
	public void off() {
		System.out.println("fan off");
		
	}
	
}
public class FanDriver {
public static void main(String[] args)
{
	Regulator r=new Fan();
	r.incSpeed();
	r.decSpeed();
//	r.on();//CTE
//	r.off();//CTE
	Switch s=new Fan();
	s.on();
	s.off();
//	s.incSpeed();//CTE
//	s.decSpeed();//CTE
	Fan f=(Fan)s;
	f.on();
	f.incSpeed();
	f.decSpeed();
	f.off();
}
}
