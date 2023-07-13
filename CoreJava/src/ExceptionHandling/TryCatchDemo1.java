package ExceptionHandling;

public class TryCatchDemo1 
{
	public static void main(String[] args)
	{
		try
		{
		int data=10/0;//exception
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("This is an example of exception1");
		System.out.println("This is an example of exception2");
		System.out.println("This is an example of exception3");
		System.out.println("This is an example of exception4");
		System.out.println("This is an example of exception5");
		System.out.println("This is an example of exception6");
	}

}
