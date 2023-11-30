package inheitance;

class ArithmeticOperator
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
class Operator1 extends ArithmeticOperator
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
public class Operator2 extends Operator1
{
	void rem()
	{
		c=a%b;
		System.out.println("Remainder of a and b is :"+c);
	}

	public static void main(String[] args) 
	{
		Operator2 obj=new Operator2();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.rem();
	}

}
