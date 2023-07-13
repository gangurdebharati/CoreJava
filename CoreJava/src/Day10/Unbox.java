package Day10;

public class Unbox 
{
	
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		
		Integer a=new Integer(3);
		
		//int i=a.intValue();//convert Integer to int explicitly
		
		int j=a;//unboxing 
		
		System.out.println(a);
		System.out.println(j);
	}

}
