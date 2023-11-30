package constructor;

//without this keyword

 class Student3
{
	int rollno;
	String name;
	float fee;
	
	Student3(int rollno, String name, float fee)
	{
		rollno=rollno;
		name=name;
		fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
	
}
public class TestThis1 
{
	public static void main(String[] args)
	{
		Student3 s=new Student3(1,"Tom",500.98f);
		s.display();
	}

}
