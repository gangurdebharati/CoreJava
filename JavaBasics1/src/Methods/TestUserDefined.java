package Methods;

public class TestUserDefined 
{
	void sum(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args)
	{
		TestUserDefined obj=new TestUserDefined();
		obj.sum(10, 100);

	}

}
