package ExceptionHandling;

public class FinalDemo 
{
	final int age=18;//constant
	
	/*
	 * void display() { age=55; }
	 */
	
	public static void main(String[]args)
	{
		FinalDemo obj=new FinalDemo();
		System.out.println(obj.age);
		//obj.display();
	}

}
