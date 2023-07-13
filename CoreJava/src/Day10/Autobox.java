package Day10;

public class Autobox 
{
	public static void main(String[]args)
	{
		int a=20;//convert int into Interger autoboxing
		
		Integer j=a;//autoboxing
		
		Integer i=Integer.valueOf(a);
		
		System.out.println(a);
		System.out.println(j);
		System.out.println(i);
	}

}
