package com.tns.constructor;

class Demo
{
	TestThisEx4 obj;
	
	Demo(TestThisEx4 obj)
	{
		this.obj=obj;
	}
	void display()
	{
		System.out.println(obj.data);
	}
}
public class TestThisEx4 
{
	int data=10;
	TestThisEx4()
	{
	Demo d=new Demo(this);
	d.display();
	}
	public static void main(String[] args) 
	{
	
		TestThisEx4 a=new TestThisEx4();
		
	}

}
