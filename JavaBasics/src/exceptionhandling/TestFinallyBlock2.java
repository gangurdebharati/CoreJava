package exceptionhandling;

public class TestFinallyBlock2 
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside the try block...");
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Finally block is always executed");
		}
	}

}
