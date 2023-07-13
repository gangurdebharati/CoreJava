package ExceptionHandling1;

public class TryCatchEx2 {

	public static void main(String[] args) 
	{
		try
		{
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[10]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handeled");

	}

}
