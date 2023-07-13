package Day10;

class Encap
{
	private int value;//data hiding 
	
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
		Encap obj=new Encap();
		
		obj.setValue(100);
		
		System.out.println(obj.getvalue());
	}

}
