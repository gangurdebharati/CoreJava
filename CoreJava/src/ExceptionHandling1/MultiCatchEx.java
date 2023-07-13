package ExceptionHandling1;

public class MultiCatchEx {

	public static void main(String[] args) {
		
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException occurs ");
		}

	}

}
