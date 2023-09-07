package com.tns.polymorphism;

class Shape
{
	void draw() 
	{
		System.out.println("Can't define shape type");
	} 
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Square Shape");
	}
}
public class MethodOverrideDemo 
{
	public static void main(String[] args) 
	{
		Square s=new Square();
		s.draw();
		

	}

}
