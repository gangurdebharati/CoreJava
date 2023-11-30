package typecasting;

public class NarrowingTypeCastEx 
{
	public static void main(String[] args) 
	{
		long l=2345678;
		int i=(int)l;
		
		System.out.println("Before conversion :"+l);
		System.out.println("After conversion :"+i);

	}

}
