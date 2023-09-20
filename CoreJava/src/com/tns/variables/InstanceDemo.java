package com.tns.variables;

public class InstanceDemo 
{
	int a=50,b=5,c;
	
	void divide()
	{
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		InstanceDemo obj=new InstanceDemo();
		obj.divide();
	}

}
