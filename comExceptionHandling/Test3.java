package comExceptionHandling;

public class Test3 {

	public static void main(String[] args) {
		String s="java";
		int[]a= {1,2,5};
		try
		{
			System.out.println(s.charAt(1));
			System.out.println(a[2]/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException block");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException block");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException block");
		}
		catch(Exception e)
		{
			System.out.println("Exception-Block");
		}
		

	}

}
