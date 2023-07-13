package Day7;

class Animal1
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Cat extends Animal1
{
	void bark()
	{
		System.out.println("meowing");
	}
}
public class TestInheritance1 {
	
	public static void main(String[]args)
	{
		Cat c=new Cat();
		c.eat();
		c.bark();
	}

}
