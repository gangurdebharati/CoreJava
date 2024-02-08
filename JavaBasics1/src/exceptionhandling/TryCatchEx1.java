package exceptionhandling;

public class TryCatchEx1 
{
	public static void main(String[] args) 
	{
		try
		{
		int data=50/0;//may throw exception
		}
		//handling the exception
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code..");
     
	}

}
