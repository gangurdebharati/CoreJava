package oopsConcept;

public class Demo 
{
	int id=1;
	String name="Tom";

	void show()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[]args)
	{
		Demo d=new Demo();
		d.show();
	}

}
