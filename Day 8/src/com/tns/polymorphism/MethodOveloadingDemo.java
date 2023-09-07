package com.tns.polymorphism;

public class MethodOveloadingDemo 
{
	int add()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
		//System.out.println(c);
	}
	void add(int x,int y)
	{
		int c=x+y;;
		System.out.println(c);
	} 
	void add(int x, double y)
	{
		double c=x+y;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		MethodOveloadingDemo obj=new MethodOveloadingDemo();
		int a=obj.add();
		System.out.println(a);
		obj.add(300, 500);
		obj.add(50, 5645367.90);
	}

}
