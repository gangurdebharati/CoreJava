package com.tns.keyword;

class StatDemo
{
	static int a=10;
	static void display()
	{
		System.out.println("This is a static method");
	}
	static
	{
		System.out.println("Static Block");
	}
}
public class StaticTestDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(StatDemo.a);
		StatDemo.display();

	}

}
