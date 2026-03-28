package comExceptionHandling;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main starts");
		int[] a= {2,3,1,4,3,2};
		try
		{
		//System.out.println(a[6]);
		System.out.println(a[9]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled");
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("ArrayHandled");
//		}
		
		finally {
			System.out.println("Special code");
		}
		System.out.println("Main Ends");
	}

}
