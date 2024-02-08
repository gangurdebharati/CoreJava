package exceptionhandling;

public class MultipleCatchBlock1
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
			
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
