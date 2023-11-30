package constructors;

public class Student 
{
	int id;
	String name;
	
	Student(int i,String n)
	{
	   id=i;	
	   name=n;
	}
	void display()
	{
		System.out.println(id + " " +name);
	}
	public static void main(String[] args) 
	{
		Student obj=new Student(1,"Tom");
		obj.display();

	}

}
