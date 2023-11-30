package superkeyword;
//For variables

class Base
{
	int a=10;
}
public class Derived extends Base
{
	int a=20;
	
	void show()
	{
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[]args)
	{
		Derived obj=new Derived();
		obj.show();
	}
}
