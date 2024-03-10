package com.tns.basics;

public class UserDefinedDemo 
{
	void subtraction()
	{
		int a=500,b=10,c;
		
		c=a-b;
		
		System.out.println("The Substraction of a and b is :"+c);
	}
	public static void main(String[] args) 
	{
		UserDefinedDemo obj=new UserDefinedDemo();
		obj.subtraction();
	}

}
