package com.tns.inheritance;

class Student
{
	 int rollno,marks;
	 String name;
	 
	 void input()
	 {
		 System.out.println("Enter your rollno,name and marks :");
	 }
}
public class SingleDemo extends Student
{
     void display()
     {
    	 rollno=101;
    	 marks=89;
    	 name="Tom";
    	 
    	 System.out.println(rollno+" "+name+" "+marks);
     }
     public static void main(String[]args)
     {
    	 SingleDemo obj=new SingleDemo();
    	 obj.input();
    	 obj.display();
     } 
}
