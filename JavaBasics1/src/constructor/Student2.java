package constructor;

public class Student2 
{
	int id;
	String name;
	
	Student2(int i, String n)//parameterized constructor
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[]args)
	{
		Student2 s=new Student2(1,"Peter");
		s.display();
	}

}
