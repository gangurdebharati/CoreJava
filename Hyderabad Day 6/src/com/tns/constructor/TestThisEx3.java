package com.tns.constructor;

class X
{
	X()
	{
		System.out.println("This is class constructor");
	}
	X(int x)
	{
		this();
		System.out.println(x);
	}

}
public class TestThisEx3 
{
	public static void main(String[] args)
	{
	   X obj=new X(10);

	}

}
