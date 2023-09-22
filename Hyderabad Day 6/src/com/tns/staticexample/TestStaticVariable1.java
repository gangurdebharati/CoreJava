package com.tns.staticexample;

class Student
{
	int rollno;
	String name;
	static String college="TKR";
	
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class TestStaticVariable1 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"Tom");
		Student s2=new Student(2,"Peter");
		
		s1.display();
		s2.display();

	}

}
