package comExceptionHandling;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		int[] a= {4,3,2,1};
		try
		{
			System.out.println("Outer try");
			System.out.println(a[a.length]);
			try
			{
				System.out.println("Inner try");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Inner catch");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Outer catch"); 
		}
		System.out.println("Main ends");
	}
 
}
