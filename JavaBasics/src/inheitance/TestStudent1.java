package inheitance;

class Student
{
    int rollno,marks;
	String name;
	
	void input()
	{
		System.out.println("Enter your rollno, name and marks :");
	}
}
public class TestStudent1 extends Student
{
	void display()
	{
		rollno=1;
		name="Peter";
		marks=89;
		
		System.out.println(rollno+" "+name+" "+marks);
	}
	public static void main(String[] args) 
	{
	    TestStudent1 obj=new TestStudent1();
	    obj.input();
	    obj.display();
	}

}
