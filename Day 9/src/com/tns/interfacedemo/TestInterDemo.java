package com.tns.interfacedemo;

interface Printable//super1
{
	void print();
}
interface Showable//super2
{
	void show();
}
class Demo implements Printable,Showable
{
	public void print()
	{
		System.out.println("Printable Interface");
	}
	public void show()
	{
		System.out.println("Showable Interface");
	}
	
}
public class TestInterDemo {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.print();
		d.show();

	}

}
