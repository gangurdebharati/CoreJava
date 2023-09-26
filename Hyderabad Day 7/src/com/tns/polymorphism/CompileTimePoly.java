package com.tns.polymorphism;

public class CompileTimePoly 
{
	int add()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
	void add(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println(z);
	}
	void add(int p, double q)
	{
		double s;
		s=p+q;
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		CompileTimePoly obj=new CompileTimePoly();
		int a=obj.add();
		System.out.println(a);
		obj.add(100, 200);
		obj.add(10, 100.89);
	}
}
