package com.tns.variables;

public class StaticDemo 
{
	static int data=10;
	
	 static void input()
	{
		System.out.println("Static method");
	}
	public static void main(String[]args)
	{
		System.out.println(data);
		input();
	}

}
