package exceptionhandling;

public class FinalExample 
{
	final int age=18;
	
	void display()
	{
		age=50;
		System.out.println("Age is :"+age);
	}
	public static void main(String[]args)
	{
		FinalExample obj=new FinalExample();
		obj.display();
	}
}
