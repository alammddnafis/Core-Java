package comExceptionHandling;

public class NullPoi {	
		public  void m1()
		{
			System.out.println("m1()-method");
		}
	public static void main(String[] args) {
		NullPoi m=null;
		System.out.println("Main Starts");
		m.m1();
		System.out.println("Main ends");

	}

}
