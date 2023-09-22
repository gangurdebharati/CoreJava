package com.tns.constructor;

class A
{
	void m()
	{
		System.out.println("This is m() method");
	}
	void n()
	{
		System.out.println("This is n() method");
		this.m();
	}
}
public class TestThisEx2 
{
	public static void main(String[] args) 
	{
	 A obj=new A();
	 obj.n();

	}

}
