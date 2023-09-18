package com.tns.accessmodifiers;

class A
{
	  int data=40;
	  void msg()
	{
		System.out.println("Welcome, students in TNS India Foundation");
	}
}
public class PrivateDemo 
{
	public static void main(String[]args)
	{
		A obj=new A();
		obj.msg();
		System.out.println(obj.data);
	}

}
