package Day9;

interface PersonEat//1
{
	void eat();
}
interface PersonTravel//2
{
	void eat();
}
public class Test implements PersonEat,PersonTravel
{
	public void eat()
	{
		System.out.println("Person is eating food");
	}
	public void travel()
	{
		System.out.println("Person is travelling from mumbai to delhi");
	}
	
	public static void main(String[]args)
	{
		Test obj=new Test();
		obj.eat();
		obj.travel();
	}
}
