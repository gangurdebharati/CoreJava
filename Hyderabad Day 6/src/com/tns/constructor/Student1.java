package com.tns.constructor;

public class Student1 
{
	 int id;
	 String name;
	 
	 void display()
	 {
		 System.out.println(id+" "+name);
	 }
	 public static void main(String[]args)
	 {
		 Student1 s1=new Student1();
		 Student1 s2=new Student1();
		 
		 s1.display();
		 s2.display();
	 }
	 

}
