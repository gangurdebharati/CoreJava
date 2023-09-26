package com.tns.overloading;

class ConOverload
{
	ConOverload()//no-arg
	{
		System.out.println("This is a constructor without parameter");
	}
	ConOverload(int a)//parameterized
	{
		System.out.println("This is a parameterized constructor and the value of a is"+a);
	}
}
public class TestConstruct 
{
	public static void main(String[] args) 
	{
		ConOverload c1=new ConOverload();
		ConOverload c2=new ConOverload(100);

	}

}
