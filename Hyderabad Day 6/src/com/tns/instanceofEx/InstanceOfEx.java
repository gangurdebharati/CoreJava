package com.tns.instanceofEx;

class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{ 
	void bark()
	{
		System.out.println("Barking");
	}
	
}
public class InstanceOfEx 
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		System.out.println(d instanceof Animal);

	}

}
