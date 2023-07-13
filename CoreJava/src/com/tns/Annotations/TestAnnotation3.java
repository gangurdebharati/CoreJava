package com.tns.Annotations;

class A
{  
void m()
{
	System.out.println("hello m");
}  
  
@Deprecated 
void n()
{
	System.out.println("hello n");
}  
}  
  
class TestAnnotation3
{  
public static void main(String args[])
{  
A a=new A();  
a.m();
a.n();
}
}  