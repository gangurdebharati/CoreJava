package ExceptionHandling1;

public class TestFinallyBlock1 
{
	public static void main(String[] args) 
	{
		try
		{
			int data=25/0;
			System.out.println(data);
		}
	   catch(Exception e)
	    {
	 	    System.out.println(e);
	    }
		finally
		{
			System.out.println("Finally block is always exceuted");
		}
		System.out.println("rest of the code");
	
	}

}
