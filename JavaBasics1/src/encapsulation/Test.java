package encapsulation;

class SetMethod
{
	private int value;//data hiding
	
	public void setValue(int x)
	{
		value=x;
	}
	public int getValue()
	{
		return value;
	}
	
}
public class Test
{
	public static void main(String[] args) 
	{
		
		SetMethod obj=new SetMethod();
		obj.setValue(100);
		System.out.println(obj.getValue());

	}

}
