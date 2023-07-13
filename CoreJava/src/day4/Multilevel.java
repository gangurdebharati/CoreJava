package day4;

 class Operator1  //super
{
	int a,b,c;
	
	void add()
	{
		a=50;
		b=50;
		c=a+b;
		System.out.println("Addition of two numbers is :"+c);
	}
	void sub()
	{
		a=50;
		b=10;
		c=a-b;
		System.out.println("Subtraction of two number is :"+c);
	}
}
 class Operator2 extends Operator1   //sub1
{
	
	void mul()
	{
		a=10;
		b=5;
		c=a*b;
		System.out.println("Multiplication of two number is :"+c);
	}
	void div()
	{
		a=50;
		b=10;
		c=a/b;
		System.out.println("Division of two numbers is :"+c);
	}
}
class Operator3 extends Operator2
{
	
	void rem()
	{
		a=100;
		b=10;
		c=a%b;
		System.out.println("Reaminder of two numbers is :"+c);
		
	}
}

public class Multilevel {

	public static void main(String[] args) {
		
		Operator3 obj=new Operator3();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.rem();

	}

}
