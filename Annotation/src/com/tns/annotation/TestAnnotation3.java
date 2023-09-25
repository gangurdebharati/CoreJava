package com.tns.annotation;

class A
{
	void m()
	{
		System.out.println("This is m() method");
	}
	@Deprecated
	void n()
	{
		System.out.println("This is n() method");
	}
}
public class TestAnnotation3
{
	public static void main(String[]args)
	{
		A obj=new A();
	    obj.m();
	    obj.n();
	}
}
