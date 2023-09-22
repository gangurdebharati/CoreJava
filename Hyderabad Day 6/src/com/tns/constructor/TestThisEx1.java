package com.tns.constructor;

class Student3
{
	int rollno;
	String name;
	float fee;
	
	Student3(int r,String n,float f)
	{
		rollno=r;
		name=n;
		fee=f;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}
public class TestThisEx1 
{
	public static void main(String[] args) 
	{
		Student3 s1=new Student3(1,"Chandana",5000f);
		Student3 s2=new Student3(2,"Arvind",6500f);
		s1.display();
		s2.display();

	}

}
