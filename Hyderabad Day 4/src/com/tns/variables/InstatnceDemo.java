package com.tns.variables;

public class InstatnceDemo
{
	int a=10,b=20,c;
	
	void add()
	{
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		InstatnceDemo obj=new InstatnceDemo();
		obj.add();
	}

}
