package superkeyword;
//For constructor

class Parent
{
	Parent(int a)
	{
		System.out.println("This is parent class constructor..."+a);
	}
}
public class Child extends Parent
{
    Child()
    {
    	super(10);
    	System.out.println("This is child class constructor...");
    }
    
    public static void main(String[]args)
    {
    	Child obj=new Child();
    }

}
