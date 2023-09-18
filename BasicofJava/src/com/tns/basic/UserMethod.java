package com.tns.basic;

public class UserMethod 
{
	int a=100,b=200,c;
	
	void add()
	{
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		UserMethod obj=new UserMethod();
		obj.add();
	}

}
