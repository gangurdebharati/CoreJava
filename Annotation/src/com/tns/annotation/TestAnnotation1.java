package com.tns.annotation;

class Animal
{
	void eatSomething()
	{
		System.out.println("Animal eating something");
	}
}
class Dog extends Animal
{
	@Override
	void eatSomething()
	{
		System.out.println("Dog is eating something");
	}
}

public class TestAnnotation1 
{
	public static void main(String[]args)
	{
		Animal d=new Dog();
		d.eatSomething();
	}
}
