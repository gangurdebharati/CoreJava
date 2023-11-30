package abstraction;

abstract class Programming
{
	public abstract void developer();
	public abstract void rank();
}
class HTML extends Programming
{
	public void developer()
	{
		System.out.println("Tim Berner Lee");
	}
	public void rank()
	{
		System.out.println("3rd Rank");
	}
}
abstract class Java extends Programming
{
	public void developer()
	{
		System.out.println("James Gosling");
	}
	
}
public class TestAbstract 
{
	public static void main(String[] args) 
	{
		Programming h=new HTML();
		h.developer();
		h.rank();
		
		
	}

}
