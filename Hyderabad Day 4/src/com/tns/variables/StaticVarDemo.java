package com.tns.variables;

public class StaticVarDemo
{
	 int a=500,b=10,c;
	
	 void divide()
	{
		c=b/a;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		StaticVarDemo obj=new StaticVarDemo();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.divide();
	}

}
