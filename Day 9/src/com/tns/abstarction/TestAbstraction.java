package com.tns.abstarction;

abstract class Shape
{
	abstract void draw();
	abstract void add();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing rectangle..");
	}
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
}
abstract class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle..");
	}
}
public class TestAbstraction 
{
	public static void main(String[] args)
	{
		Shape r=new Rectangle();
		r.draw();
		
		
	}

}
