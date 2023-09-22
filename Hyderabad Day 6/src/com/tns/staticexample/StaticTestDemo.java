package com.tns.staticexample;

class StaticEx
{
	 static int x=100;
	 static void msg()
	{
		System.out.println("Static Method");
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
		System.out.println(StaticEx.x);
		StaticEx.msg();

	}

}
