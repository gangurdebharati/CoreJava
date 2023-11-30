package superkeyword;
//For Method
class A
{
	void show()
	{
		System.out.println("This is super class method...");
	}
}
class B extends A
{
	void show()
	{
		super.show();
		System.out.println("This is sub class method...");
	}
}
public class SuperMethod 
{
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.show();
		
	}

}
