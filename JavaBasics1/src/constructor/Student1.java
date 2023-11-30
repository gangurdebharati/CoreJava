package constructor;

public class Student1
{
	int id;
	String name;
	
	void display()
	{
		System.out.println(id+ " "+name);
	}
	public static void main(String[]args)
	{
		Student1 s1=new Student1();//default constructor
		s1.display();
	}

}
