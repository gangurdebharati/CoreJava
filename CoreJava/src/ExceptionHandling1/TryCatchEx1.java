package ExceptionHandling1;

public class TryCatchEx1 {

	public static void main(String[] args)
	{
		try
		{
		int data=10/0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Hello Everyone");
		

	}

}
