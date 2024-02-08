package exceptionhandling;

public class FinallyExample 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Inside try block...");
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code...");

	}

}
