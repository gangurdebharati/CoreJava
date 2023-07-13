package Overloding;

class MethodOverload
{
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Addition of a and b is :"+c);
	}
	
	void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Additon of x and y is :"+z);
	}
}
public class MOverload {

	public static void main(String[] args)
	{
		MethodOverload obj=new MethodOverload();
		obj.add();
		obj.add(100, 500);
	}

}
