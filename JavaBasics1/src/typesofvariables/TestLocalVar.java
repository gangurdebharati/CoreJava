package typesofvariables;

public class TestLocalVar
{
	void add(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		TestLocalVar obj=new TestLocalVar();
		obj.add(20,5);

	}

}
