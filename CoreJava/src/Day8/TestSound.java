package Day8;

abstract class Animal//super
{
	public abstract void sound();
}

class Dog extends Animal
{
	 public void sound()
	{
		System.out.println("Dog is barking");
	}
}

class Lion extends Animal
{
	 public void sound()
	{
		System.out.println("Lion is roar");
	}
}

public class TestSound {

	public static void main(String[] args) {
		
		Animal d=new Dog();
		Animal l=new Lion();
		
		d.sound();
		l.sound();

	}

}
