package basics;

final class FinalDemo
{
	void show()
	{
		System.out.println("This is show method");
	}
}
public class FinalClassDemo extends FinalDemo
{
	void display()
	{
		System.out.println("This is display method");
	}
	
	public static void main(String[]args)
	{
		FinalClassDemo obj=new FinalClassDemo();
		obj.show();obj.display();
	}
	

}
