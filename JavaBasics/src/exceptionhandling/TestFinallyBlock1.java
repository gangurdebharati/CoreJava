package exceptionhandling;

public class TestFinallyBlock1 
{
	public static void main(String[] args) 
	{
		try
		{
			int data=25/5;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is always executed...");
		}
		

	}

}
