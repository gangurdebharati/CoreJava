package basics;

 class StaticTest
{
	static int a=10;
	
	static void display()
	{
		System.out.println("This is display method...");
	}
	static
	{
		System.out.println("This is static block");
	}
}

 public class StaticDemo
 {
	 
	public static void main(String[]args)
	{
		
		System.out.println(StaticTest.a);
		StaticTest.display();
		
	}

}
