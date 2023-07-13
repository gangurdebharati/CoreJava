package day4;

class Student
{
	 int rollno,marks;
	String name;
	
	 void input()
	{
		System.out.println("Enter rollno, name and marks :");
	}
}
class Tom extends Student
{
	void display()
	{
		rollno=1;
		marks=88;
		name="Tom";
		
		System.out.println(rollno+" "+name+" "+marks);
	}
}

public class Single {

	public static void main(String[] args) {
		
		Tom obj=new Tom();
		obj.input();
		obj.display();
		

	}

}
