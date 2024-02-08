package exceptionhandling;

public class MultipleCatchBlock3 
{
	public static void main(String[] args) 
	{
		try
		{
		String s=null;
		System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}


	}

}
