package basics;

 class TestDemo
{
	final void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}

 }
public class FinalTest extends TestDemo
{
	@Override
	void add(int x,int y)
	{
		int z=x+y;
		System.out.println(z);	
	}

	public static void main(String[]args)
	{
		FinalTest obj=new FinalTest();
		obj.add();
		obj.add(100, 100);
	}
}
