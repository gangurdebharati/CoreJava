package com.tns.keyword;

class Base
{
	final void run()
	{
		System.out.println("This is base class method.");
	}
}
class Sub extends Base
{
	void run()
	{
		
		System.out.println("This is sub class method.");
	}
}

public class FinalMethod {

	public static void main(String[] args) 
	{
		Sub obj=new Sub();
		obj.run();

	}

}
