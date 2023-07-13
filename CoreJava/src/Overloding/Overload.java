package Overloding;

class ConOverload
{
	ConOverload()
	{
		System.out.println("This is a constructor without any parameter...");
	}
	ConOverload(int a)
	{
		System.out.println("This is parameterized constructor and value of a is :"+a);
	}
}

public class Overload {

	public static void main(String[] args)
	{
		
		ConOverload obj1=new ConOverload();
		ConOverload obj2=new ConOverload(10);
	}

}
