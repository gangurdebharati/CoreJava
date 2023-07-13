package Day8;

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
	    System.out.println("3rd");	
	}
}
class Java extends Programming
{
	 public void developer()
	 {
		 System.out.println("James Gosling");
	 }
	 public void rank()
	 {
		 System.out.println("1st");
	 }
}

public class TestDeveloper {

	public static void main(String[] args) {
		
		Programming h=new HTML();
		h.developer();
		h.rank();
		
		Programming j=new Java();
		j.developer();
		j.rank();

	}

}
