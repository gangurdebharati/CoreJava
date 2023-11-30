package typesofvariables;

public class TestInstanceVar 
{
	double a=3456678.89,b=5646457.90;
	
	void add()
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		TestInstanceVar obj=new TestInstanceVar();
		obj.add();

	}

}
