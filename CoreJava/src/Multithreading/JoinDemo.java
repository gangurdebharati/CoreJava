package Multithreading;

public class JoinDemo extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
		}
	}
	
	public static void main(String[]args)
	{
		JoinDemo t1=new JoinDemo();
		JoinDemo t2=new JoinDemo();
		JoinDemo t3=new JoinDemo();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t2.start();
		
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t1.start();
		t3.start();
		
		String name=Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
		}
	}
}
