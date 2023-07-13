package ExceptionHandling;

public class ThrowDemo 
{
	static void checkAge(int age)throws ArithmeticException
	{
		if(age < 18)
		{
			throw new ArithmeticException("Access denied- you must be at least 18 years old.");
		}
		else
		{
			System.out.println("Access granted");
		}
	}
	public static void main(String[]args)
	{
		checkAge(19);
	}

}
