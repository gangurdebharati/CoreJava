package ExceptionHandling;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException occurs");
		}
	System.out.println("rest of the code");
	}

}
