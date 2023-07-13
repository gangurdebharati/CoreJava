package ExceptionHandling;

public class TryCatchDemo3 {

	public static void main(String[] args) {
		
		try
		{
		String s=null;
		System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exceptiob occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException ocuurs");
		}
		System.out.println("rest of the code");
	}

}
