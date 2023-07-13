package Multithreading;

public class TestJoinDemo extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[]args)
	{
		TestJoinDemo t1=new TestJoinDemo();
		TestJoinDemo t2=new TestJoinDemo();
		TestJoinDemo t3=new TestJoinDemo();
		
		t1.start();
		
		try
		{
			t1.join(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
		
	}

}
