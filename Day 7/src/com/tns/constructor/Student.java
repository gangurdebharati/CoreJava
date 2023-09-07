package com.tns.constructor;

public class Student 
{
	int rollno;
	String name;
	float fee;
	Student(int r,String n,float f)
	{
		rollno=r;
		name=n;
        fee=f;
	}
	void display()
	{
		System.out.println(rollno+ " "+name+ " "+fee);
	}
	public static void main(String[]args)
	{
		Student s1=new Student(1,"Mike",1254.67f);
		s1.display();
	}

}
