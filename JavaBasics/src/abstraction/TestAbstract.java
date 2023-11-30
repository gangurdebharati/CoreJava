package abstraction;

abstract class Programming
{
	public abstract void developer();
	public abstract void rank();
}
 class HTML extends Programming
{
	@Override
	public void developer()
	{
		System.out.println("Tim Berner Lee");
	}
	@Override
	public void rank()
	{
		System.out.println("3rd Rank");
	}
}
 class Java extends Programming
{
	@Override
	public void developer()
	{
		System.out.println("James Gosling");
	}
	@Override
	public void rank()
	{
		System.out.println("1st Rank");
	}
}
public class TestAbstract 
{
	public static void main(String[] args) 
	{
		Programming h=new HTML();
		h.developer();
		h.rank();
		
		Programming j=new Java();
		j.developer();
		j.rank();

	}

}
