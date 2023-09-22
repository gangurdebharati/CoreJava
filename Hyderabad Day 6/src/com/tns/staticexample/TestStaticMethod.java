package com.tns.staticexample;

class Student1
{
	int rollno;
	String name;
	static String college="TKR";
	
	static void change()
	{
		college="Somaiya";
	}
	Student1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class TestStaticMethod 
{
	public static void main(String[] args) 
	{
		Student1.change();
		Student1 s1=new Student1(1,"Sai Pavan");
		Student1 s2=new Student1(2,"Chandana");
		Student1 s3=new Student1(3,"Venkat");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
