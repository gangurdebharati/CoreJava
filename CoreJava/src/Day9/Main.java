package Day9;

class Person//super
{
	void msg()
	{
		System.out.println("This is msg method");
	}
}
class Tom extends Person
{
	void display()
	{
		System.out.println("This is display method");
	}
}
public class Main {

	public static void main(String[] args) {
		
		Tom t = new Tom();
		t.msg();
		t.display();
		
		System.out.println(t instanceof Person);
		

	}

}
