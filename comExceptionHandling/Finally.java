package comExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println("DB Open");
		try
		{
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled");
		}
		finally
		{
		System.out.println("DB Closed");
		}
		System.out.println("Main Ends");
	}

}
