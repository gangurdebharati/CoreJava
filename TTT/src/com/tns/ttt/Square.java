package com.tns.ttt;

class Shape
{
	void draw()
	{
		System.out.println("Can't define shape type");
	}
}
public class Square extends Shape
{
	
	void draw2()
	{
		System.out.println("Square Shape");
	}
	
	public static void main(String[]args)
	{
		Square s=new Square();
		s.draw();
	}

}
