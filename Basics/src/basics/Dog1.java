package basics;

class Animal1
{
	void display()
	{
		System.out.println("This is an example of instance of operator");
	}
}  
class Dog1 extends Animal1
{
	void show()
	{
		System.out.println("This is subclass method");
	}
  
 public static void main(String args[])
 {  
 Dog1 d=new Dog1();  
 d.display();
 System.out.println(d instanceof Animal1);
 }  
}  