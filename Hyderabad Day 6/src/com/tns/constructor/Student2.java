package com.tns.constructor;

public class Student2 
{
	int id;
	String name;
	
	Student2(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[]args)
	{
		Student2 s1=new Student2(101,"Peter");
		Student2 s2=new Student2(102,"Tom");
		
		s1.display();
		s2.display();
	}

}
