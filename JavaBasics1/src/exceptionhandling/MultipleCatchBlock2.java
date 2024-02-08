package exceptionhandling;

public class MultipleCatchBlock2
{
	public static void main(String[] args) 
	{
		try
		{
		int a[]=new int[5];
		System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code..");


	}

}
