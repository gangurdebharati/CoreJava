package Encapsulation;

class setDemo
{
	private int value;//data-hiding
	
	public void setValue(int x)
	{
		value=x;
	}
	public int getvalue()
	{
		return value;
	}
}

public class EncapDemo 
{
	public static void main(String[]args)
	{
		setDemo obj=new setDemo();
		obj.setValue(100);
		System.out.println(obj.getvalue());
	}
}
