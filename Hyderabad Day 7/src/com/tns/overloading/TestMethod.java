package com.tns.overloading;

class Demo
{
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println(z);
	}
}
public class TestMethod
{
	public static void main(String[] args)
	{
	 Demo d=new Demo();
	 d.add();
	 d.add(500, 700);

	}

}
