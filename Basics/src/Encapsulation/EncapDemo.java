package Encapsulation;

class SetMethod
{
	private int value;
	
	public void setValue(int x)
	{
		value=x;
	}
	
	public int getValue()
	{
		return value;
	}
}
public class EncapDemo
{
	public static void main(String[] args)
	{
		SetMethod obj=new SetMethod();
		obj.setValue(100);
		System.out.println(obj.getValue());

	}

}
