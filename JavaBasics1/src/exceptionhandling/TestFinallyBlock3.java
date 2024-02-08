package exceptionhandling;

public class TestFinallyBlock3 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Inside try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Finally Block is always executed... ");
		}
		System.out.println("rest of the code");

	}

}
