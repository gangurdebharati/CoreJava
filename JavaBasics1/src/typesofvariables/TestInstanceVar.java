package typesofvariables;

public class TestInstanceVar 
{
	int a=10,b=5,m;
	
	void div()
	{
		m=a/b;
		System.out.println(m);
	}
	public static void main(String[] args) 
	{
		TestInstanceVar obj=new TestInstanceVar();
		obj.div();
	}

}
