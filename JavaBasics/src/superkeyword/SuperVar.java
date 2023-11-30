package superkeyword;

//for variable
class Base
{
	int a=10;
}
class Derived extends Base
{
	int a=20;
	
	void show()
	{
		System.out.println(super.a);
		System.out.println(a);
	}
}

public class SuperVar 
{
	public static void main(String[] args) 
	{
		Derived obj=new Derived();
		obj.show();

	}

}
