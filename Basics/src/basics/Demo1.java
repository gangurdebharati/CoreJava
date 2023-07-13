package basics;

interface AnimalEat 
{
	   void eat();
}
interface AnimalTravel 
{
	   void travel();
	   void rating();
}
class Animal implements AnimalEat, AnimalTravel 
{
	   public void eat()
	   {
	      System.out.println("Animal is eating");
	   }
	   public void travel()
	   {
	      System.out.println("Animal is travelling");
	   }
	   public void rating()
	   {
		   System.out.println("5 star");
	   }
}
	public class Demo1
	{
	   public static void main(String args[]) 
	   {
	      Animal a = new Animal();
	      a.eat();
	      a.travel();
	      a.rating();
	   }
	}