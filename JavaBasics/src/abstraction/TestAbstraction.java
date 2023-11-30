package abstraction;

abstract class Animal
{
	Animal()
	{
		System.out.println("All Animals...");
	}
	public abstract void sound();
}
class Dog extends Animal
{
	Dog()
	{
		super();
	}
	public void sound()
	{
		System.out.println("Dog is barking...");
	}
}
class Lion extends Animal
{
	Lion()
	{
		super();
	}
	public void sound()
	{
		System.out.println("Lion is roar...");
	}
}
public class TestAbstraction 
{
	public static void main(String[] args)
	{
		Animal d=new Dog();
		d.sound();
		
		Animal l=new Lion();
		l.sound();

	}

}
