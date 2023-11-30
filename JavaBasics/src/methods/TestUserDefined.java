package methods;

public class TestUserDefined 
{
	int a=10,b=5,c;
	void add()
	{
		c=a+b;
		System.out.println("Addition of a and b is:"+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Subtraction of a and b is:"+c);
	}
	void mul()
	{
		c=a*b;
		System.out.println("Multiplication of a and b is:"+c);
	}
	void div()
	{
		c=a/b;
		System.out.println("Division of a and b is:"+c);
	}
    public static void main(String[]args)
    {
    	TestUserDefined obj=new TestUserDefined();
    	obj.add();
    	obj.sub();
    	obj.mul();
    	obj.div();
    	
    }

}
