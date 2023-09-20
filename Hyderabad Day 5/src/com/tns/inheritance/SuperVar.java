package com.tns.inheritance;

class Base
{
	int a=10;
}
public class SuperVar extends Base
{
	int a=20;
	void show()
	{
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		SuperVar obj=new SuperVar();
		obj.show();

	}

}
