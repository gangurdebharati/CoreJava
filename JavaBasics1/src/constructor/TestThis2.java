package constructor;
//with this keyword
class Student4
{
	int rollno;
	String name;
	float fee;
	
	Student4(int rollno, String name, float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
	
}
public class TestThis2 
{
	public static void main(String[] args)
	{
		Student4 s=new Student4(1,"Tom",500.98f);
		s.display();
	}

}
