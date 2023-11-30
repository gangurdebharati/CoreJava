package accessmodifiers;

class Demo
{
	protected int id=1;
	
	protected String name="Tom";
	
	protected void display()
	{
		System.out.println(id+" "+name);
	}
}

public class TestPrivate 
{
	public static void main(String[] args) 
	{
		Demo obj=new Demo();
		obj.display();

	}

}
