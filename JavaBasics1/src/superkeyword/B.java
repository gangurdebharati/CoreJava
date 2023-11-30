package superkeyword;
//For Method

class A
{
	void show()
	{
		System.out.println("Super class method...");
	}
}
public class B extends A 
{
	void show()
	{
		super.show();
		System.out.println("Sub class method...");
	}
	public static void main(String[]args)
	{
		B obj=new B();
		obj.show();
		
	}

}
