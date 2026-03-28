package comExceptionHandling;

public class Test1 {

	public static void main(String[] args) {
		int[] a= {4,5,3,2,1};
		System.out.println("Main Starts");
		try
		{
			System.out.println(a[a.length-1]/0);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Handled");
		}
		System.out.println("Main Ends");
	}

}
