package com.tns.finalkeyword;

class Demo
{
	final void msg()
	{
		System.out.println("messaging");
	}
}
public class FMethodDemo extends Demo 
{
	void msg()
	{
		System.out.println("Child Message");
	}
	public static void main(String[] args)
	{
		FMethodDemo d=new FMethodDemo();
		d.msg();

	}

}
