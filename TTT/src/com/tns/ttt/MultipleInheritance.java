package com.tns.ttt;

class A
{  
void msg()
{
	System.out.println("Hello");
}  
}  
class B
{  
void msg()
{
	System.out.println("Welcome");
}  
}  
class MultipleInheritance extends A,B
{     
 public static void main(String args[])
 {  
	 MultipleInheritance obj=new MultipleInheritance();  
     obj.msg();  
}  
}  