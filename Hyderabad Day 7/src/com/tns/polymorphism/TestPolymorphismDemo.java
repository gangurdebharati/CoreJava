package com.tns.polymorphism;

class Shape
{
	  void draw() 
	  {
		  System.out.println("Drawing..."); 
	 }
	 
}
class Rectangle extends Shape
{
	@Override
	void draw()
	{
		super.draw();
		System.out.println("Drawing Rectangle...");
	}
}

public class TestPolymorphismDemo 
{
	public static void main(String[] args) 
	{
	Shape s;
	s=new Rectangle();
	s.draw();
	
	}

}
