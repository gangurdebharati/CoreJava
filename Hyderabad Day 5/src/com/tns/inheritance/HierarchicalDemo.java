package com.tns.inheritance;

class Demo
{
	void input()
	{
		System.out.println("Enter your name :");
	}
}
class Main extends Demo
{
	void show()
	{
		System.out.println("My name is Tom.");
	}
}
class Simple extends Demo
{
	void display()
	{
		System.out.println("My name is Peter");
	}
}

public class HierarchicalDemo {

	public static void main(String[] args) 
	{
		Main m=new Main();
		m.input();
		m.show();
		
		Simple s=new Simple();
		s.input();
		s.display();
	
		

	}

}
