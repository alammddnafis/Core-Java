package comExceptionHandling;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
		System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		System.out.println("Main Ends");

	}

}
