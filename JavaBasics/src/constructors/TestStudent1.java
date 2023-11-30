package constructors;

public class TestStudent1
{
	int id;
	String name;
	
	void display()
	{
		System.out.println(id + " " +name);
	}
	public static void main(String[] args)
	{
		TestStudent1 obj=new TestStudent1();
		obj.display();

	}

}
