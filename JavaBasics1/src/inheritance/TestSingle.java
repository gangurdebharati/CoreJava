package inheritance;

class Student
{
	int rollno,marks;
	String name;
	
	void input()
	{
		System.out.println("Enter your rollno, name and marks:");
	}
}
public class TestSingle extends Student
{
	void display()
	{
		rollno=1;
		name="Tom";
		marks=89;
		
		System.out.println(rollno+" "+name+" "+marks);
	}
	public static void main(String[]args)
	{
		TestSingle obj=new TestSingle();
		obj.input();
		obj.display();
	}

}
