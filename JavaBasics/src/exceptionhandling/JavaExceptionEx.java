package exceptionhandling;

public class JavaExceptionEx 
{
	public static void main(String[] args) 
	{
		try
		{
		 int data=100/0;
		 System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		  System.out.println("rest of the code");

	}

}
