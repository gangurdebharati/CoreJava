package com.tns.inheritance;

class A
{
	 int a=50,b=10,c;
	 
	 void add()
	 {
		 c=a+b;
		 System.out.println("Addition of two numbers is :"+c);
	 }
	 void sub()
	 {
		 c=a-b;
		 System.out.println("Substraction of two numbers is :"+c);
	 }
}
class B extends A
{
	 void mul()
	 {
		 c=a*b;
		 System.out.println("Multiplication of two numbers is :"+c);
	 }
	 void div()
	 {
		 c=a/b;
		 System.out.println("Division of two numbers is :"+c);
	 }
}
class C extends B
{
	void rem()
	{
		c=a%b;
		System.out.println("Reamider of two numbers is :"+c);
	}
}

public class MultiLevelDemo 
{
	public static void main(String[] args) 
	{
	    C obj=new C();
	    obj.add();
	    obj.sub();
	    obj.mul();
	    obj.div();
	    obj.rem();

	}

}
