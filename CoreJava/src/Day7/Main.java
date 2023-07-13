package Day7;

class Animal//super
{
	 void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal//sub1
{
	void bark()
	{
		System.out.println("barking");
	}
}
class Cat1 extends Animal 
{
	void meow()
	{
		System.out.println("meowing");
	}
}
public class Main {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.eat();
		d.bark();
		
		Cat1 c=new Cat1();
		c.eat();
		c.meow();

	}

}
