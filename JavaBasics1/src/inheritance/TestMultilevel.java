package inheritance;

class ArithmeticOp
{
	int a=50,b=10,c;
	
	void add()
	{
		c=a+b;
		System.out.println("Addition of a and b is :"+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Subtraction of a and b is :"+c);
	}
}
class Operator extends ArithmeticOp
{
	void mul()
	{
		c=a*b;
		System.out.println("Multiplication of a and b is :"+c);
	}
	void div()
	{
		c=a/b;
		System.out.println("Division of a and b is :"+c);
	}
}
public class TestMultilevel extends Operator
{
	void rem()
	{
		c=a%b;
		System.out.println("Remainder of a and b is :"+c);
	}
	public static void main(String[]args)
	{
		TestMultilevel obj=new TestMultilevel();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.rem();
	}
}
