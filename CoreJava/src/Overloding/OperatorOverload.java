package Overloding;

public class OperatorOverload 
{
	void add()
	{
		int a=10,b=30;
		System.out.println("Addition of a & b is:"+(a+b));
	}
	public static void main(String[] args) 
	{
		OperatorOverload obj=new OperatorOverload();
		obj.add();
	}

}
