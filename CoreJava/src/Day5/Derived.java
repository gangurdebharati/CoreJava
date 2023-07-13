package Day5;

class Base
{
	Base(int a)
	{
		System.out.println("This is base class constructor" + a);
	}
	
}
class Derived extends Base 
{
    Derived()
    {
    	super(100);
    	System.out.println("This is derived class constructor");
    }
    
	public static void main(String[] args) {
		
		Derived obj=new Derived();
		

	}

}
