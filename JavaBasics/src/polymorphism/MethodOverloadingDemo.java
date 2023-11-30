package polymorphism;

public class MethodOverloadingDemo 
{
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	void add(int p,double q)
	{
		double r=p+q;
		System.out.println(r);
	}
	public static void main(String[]args)
	{
		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		obj.add();
		obj.add(20, 50);
		obj.add(40, 123456.78);
	}
}
