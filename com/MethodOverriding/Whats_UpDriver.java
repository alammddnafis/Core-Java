package com.MethodOverriding;
class what_1
{
	what_1 sent()
	{
		System.out.println("single-tick");
		return new what_1();
	}
}

class what_2 extends what_1
{
	@Override
	protected what_1 sent()
	{
		super.sent();
		System.out.println("Double-tick");
		return new what_1();
		
	}
	public void voiceMsg()
	{
		System.out.println("voice note");
	}
	
	public void videoCall() {
		System.out.println("Normal-videocall");
	}
}

class what_3 extends what_2
{
	@Override
	public what_2 sent()
	{
		super.sent();
		System.out.println("Blue-tick");
		return new what_2();
		
	}
	
	@Override
	public void videoCall() {
		super.videoCall();
		System.out.println("Filter-videocall");
	}
	
}
public class Whats_UpDriver {
 public static void main(String[] args)
 {
	 what_3 w3=new what_3();
	 w3.sent();
	 w3.voiceMsg();
	 w3.videoCall();
 }
}
