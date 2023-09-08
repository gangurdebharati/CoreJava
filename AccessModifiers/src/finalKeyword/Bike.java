package finalKeyword;

public class Bike 
{
	final int speed=50;//final variable
	
	void run()
	{
		speed=100;
	}
public static void main(String[]args)
{
	Bike obj=new Bike();
	obj.run();
}
}
