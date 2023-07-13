package Encapsulation;

 class Encapsulate
{
	private int value;
	
	public int setValue(int x)
	{
		return value=x;
	}
	public int getValue()
	{
		return value;
	}
}
public class EDemo
{
	public static void main(String[]args)
	{
		Encapsulate obj=new Encapsulate();
		obj.setValue(10);
		System.out.print(obj.getValue());
		
	}
}
