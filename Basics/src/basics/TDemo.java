package basics;

public class TDemo extends Thread
{
	
	public void fun()
	{
		try
		{
		   for(int i=1;i<=5;i++)
		     {
			   System.out.println("Thread Demo");
			   Thread.sleep(1000);
		     }
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
	
	public static void main(String[]args)throws InterruptedException
	{
		TDemo t=new TDemo();
		t.fun();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Demo");
			Thread.sleep(1000);
		}
		
		
	}
	
}
