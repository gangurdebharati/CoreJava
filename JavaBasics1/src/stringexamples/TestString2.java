package stringexamples;

public class TestString2 
{
	public static void main(String[] args) 
	{
		String a=new String("Tom");
		System.out.println(a);

		String b=new String("Tom");
		System.out.println(b);
		
		a=a.concat("Parkar");
		System.out.println(a);
	}

}
