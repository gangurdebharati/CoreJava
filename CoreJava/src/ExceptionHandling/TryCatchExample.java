package ExceptionHandling;

public class TryCatchExample 
{
	public static void main(String[] args)
	{
	 try
	 {
	 int value=50/0;
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 System.out.println("try catch example");

	}

}
