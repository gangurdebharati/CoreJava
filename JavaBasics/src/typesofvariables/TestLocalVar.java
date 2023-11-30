package typesofvariables;

public class TestLocalVar
{
	void multiplication(int x, int y)
	{
		int mul=x*y;
		System.out.println(mul);
	}
	public static void main(String[] args)
	{
		TestLocalVar obj=new TestLocalVar();
		obj.multiplication(20, 5);

	}

}
