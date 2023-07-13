package day4;

class Super
{
	void input()
	{
		System.out.println("Enter your name");
	}
}

class Sub1 extends Super
{
	void show()
	{
		System.out.println("My name is Tom");
	}
}

class Sub2 extends Super
{
	void display()
	{
		System.out.println("My name is Jerry");
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		
		Sub1 obj1=new Sub1();
		obj1.input();
		obj1.show();
		
		Sub2 obj2=new Sub2();
		obj2.input();
		obj2.display();
	}

}
