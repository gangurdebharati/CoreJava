package exceptionhandling;

public class FinalExample 
{
	final int age=18;
	
	void display()
	{
		age =30;
	}
	public static void main(String[] args) 
	{
		FinalExample obj=new FinalExample();
		obj.display();

	}

}
