package com.tns.abstraction;

abstract class Shape
{
	abstract void draw();
	abstract void input();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing rectangle");
	}
	void input()
	{
		System.out.println("Hello");
	}
}
abstract class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle");
	}
}
public class TestAbstraction1 
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.draw();
		
		

	}

}
