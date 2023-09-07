package com.tns.keyword;

public class StaticDemo 
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
	public static void main(String[]args)
	{
		System.out.println(a);
		display();
	}
	
	

}
