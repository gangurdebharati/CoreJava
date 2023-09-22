package com.tns.constructor;

public class Main 
{
	void m()
	{
		System.out.println(this);
	}

	public static void main(String[] args)
	{
	  Main obj=new Main();
	  System.out.println(obj);
	  obj.m();

	}

}
