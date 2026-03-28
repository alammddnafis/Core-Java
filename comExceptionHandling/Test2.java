package comExceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		String s="java";
		System.out.println("Main starts");
		try {
		System.out.println(s.charAt(4));
		}catch(StringIndexOutOfBoundsException e)
		{
		System.out.println("Handled");	
		}
		System.out.println("Main Ends");  
	}

}
