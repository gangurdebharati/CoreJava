package com.tns.inheritance;

class Base1
{
	Base1(int a)
	{
		System.out.println("This is Base class constructor "+a);
	}
}
public class Derived1 extends Base1
{
	Derived1()
	{
		super(100);
		System.out.println("This is Child class constructor");
	}
	public static void main(String[]args)
	{
		Derived1 obj=new Derived1();
	}

}
