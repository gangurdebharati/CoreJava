package superkeyword;

class Parent
{
	Parent(int a)
	{
		System.out.println("Parent class Constructor..."+a);
	}
}
class Child extends Parent
{
	Child()
	{
		super(100);
		System.out.println("Child class Constructor...");
	}
}
public class SuperConstructor 
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
	}

}
