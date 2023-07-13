package com.tns.Annotations;

class Animal//super
{  
void eatSomething()
{
	System.out.println("eating something");
} 
}  
  
class Dog extends Animal//sub
{  
	@Override
void eatSomething()
{
	System.out.println("eating foods");
}//should be eatSomething  
}  
  
class TestAnnotation1
{  
public static void main(String args[])
{
Animal a=new Dog();  
a.eatSomething();  
}
}  