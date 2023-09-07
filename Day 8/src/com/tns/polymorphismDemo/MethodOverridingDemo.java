package com.tns.polymorphismDemo;

class Shape
{
  void draw() 
  {
	  System.out.println("Can't define shape");
  }
	 
}
class Square extends Shape
{ 
	@Override
	void draw()
	{ 
		super.draw();
		System.out.println("Square Shape");
	}
}
public class MethodOverridingDemo 
{
  public static void main(String[]args)
  {
	  Square s=new Square();
	  s.draw();
  }
}
