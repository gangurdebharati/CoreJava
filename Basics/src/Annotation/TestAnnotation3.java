package Annotation;

class A
{  
	@Deprecated
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
class TestAnnotation3{  
public static void main(String args[]){  
  
A a=new A();  
a.n(); 
a.m();
}}  