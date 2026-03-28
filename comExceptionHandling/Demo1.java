package comExceptionHandling;
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();
		System.out.println("Main Ends");
	}
	
	public static void m1()
	{
		System.out.println("m1() Starts");
		m2();
		System.out.println("m1() Ends");
	}
	
	public static void m2()
	{
		System.out.println("m2() Starts");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		System.out.println("m2() Ends");
	

}
}
