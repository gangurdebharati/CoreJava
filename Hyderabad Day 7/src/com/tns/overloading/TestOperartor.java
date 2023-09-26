package com.tns.overloading;

class OperatorOver
{
	void add()
	{
		int x=10,y=20;
		System.out.println("x+y ="+(x+y));
	}
}
public class TestOperartor 
{
	public static void main(String[] args) 
	{

		OperatorOver o=new OperatorOver();
		o.add();
	}

}
