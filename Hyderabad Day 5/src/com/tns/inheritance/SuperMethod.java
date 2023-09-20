package com.tns.inheritance;

class DemoMain
{
	void show()
	{
		System.out.println("This is parent class method...");
	}
}

public class SuperMethod extends DemoMain
{
	void show()
	   {
		   super.show();
		   System.out.println("This is child class method...");
	   }
	
	public static void main(String[] args) 
	{
		SuperMethod obj=new SuperMethod();
		obj.show();
		

	}

}
