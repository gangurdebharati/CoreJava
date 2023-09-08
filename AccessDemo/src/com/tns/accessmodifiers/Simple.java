package com.tns.accessmodifiers;
class A
{
	  int data=10;
	  void msg()
	{
		System.out.println("This is an example of private modifier");
	}
}
public class Simple 
{
	public static void main(String[] args) 
	{
       A obj=new A();
       obj.msg();
       System.out.println(obj.data);

	}

}
