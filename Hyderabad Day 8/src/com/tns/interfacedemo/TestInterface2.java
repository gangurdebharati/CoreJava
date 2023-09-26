package com.tns.interfacedemo;

interface Printable
{
	void print();
}
interface Showble
{
	void show();
}

public class TestInterface2 implements Printable,Showble
{
	public void print()
	{
		System.out.println("This is print() method");
	}
	public void show()
	{
		System.out.println("This is show() method");
	}
	public static void main(String[] args)
	{
		
		TestInterface2 t=new TestInterface2();
		t.print();
		t.show();
	}

}
