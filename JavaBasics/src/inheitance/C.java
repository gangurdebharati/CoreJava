package inheitance;

class A
{
	void input()
	{
		System.out.println("Enter your name :");
	}
}
class B extends A
{
    void show()
    {
    	System.out.println("My name is Tom");
    }
}
public class C extends A
{
	void display()
	{
		System.out.println("My name is Jerry");
	}
	public static void main(String[] args) 
	{
		B obj1=new B();
		obj1.input();
		obj1.show();
		
		C obj2=new C();
		obj2.input();
		obj2.display();
	}

}
