package interfaceexamples;

interface Client1
{
	void add();
}
interface Client2 extends Client1
{
	void sub();
}
public class Developer implements Client2
{
	@Override
	public void add()
	{
		int a=50,b=10,c;
		c=a+b;
		System.out.println("Addition of a and b is :"+c);
	}
	@Override
	public void sub()
	{
		int p=100,q=10,r;
		r=p-q;
		System.out.println("Subtraction of p and q is :"+r);
	}
	public static void main(String[] args) 
	{
		Developer obj=new Developer();
		obj.add();
		obj.sub();
	}
}
