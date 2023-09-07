package com.tns.polymorphismDemo;

public class MethodOveloadingDemo 
{
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println(z);
	}
	void add(int x,double y)
	{
		double z=x+y;
		System.out.println(z);
	}
	public static void main(String[]args)
	{
		MethodOveloadingDemo d=new MethodOveloadingDemo();
		d.add();
		d.add(200, 500);
		d.add(50, 76776878.09);
	}

}
