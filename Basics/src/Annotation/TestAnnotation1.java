package Annotation;

class Animal
{  
void eatSomething()
{
	System.out.println("eating something");
}  
}  
  
class Dog extends Animal
{  
 @Override
void eatsomething()
{
	System.out.println("eating foods");
	
}  
}  

class TestAnnotation1{  
public static void main(String args[]){  
Dog a=new Dog();  
a.eatSomething();  
}}  
