package oopsconcept;

public class TestObjExample 
{
	int value=10;
	void input()
	{
		System.out.println("This is input method");
	}
	public static void main(String[]args)
	{
		TestObjExample o=new TestObjExample();
		System.out.println(o.value);
		o.input();
	}
}
