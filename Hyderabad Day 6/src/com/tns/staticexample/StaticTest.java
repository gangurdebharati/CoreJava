package com.tns.staticexample;

public class StaticTest
{
	static
	{
		System.out.println("Static block is invoked...");
	}

	public static void main(String[] args) 
	{
		System.out.println("This is main method");
	}

}
