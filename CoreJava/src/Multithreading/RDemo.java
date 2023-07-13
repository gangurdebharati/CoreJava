package Multithreading;

public class RDemo implements Runnable 
{
	public void run()
	{
		System.out.println("thread is running");
	}
	
	public static void main(String[]args)
	{
		RDemo obj=new RDemo();
		
		Thread t1=new Thread(obj);
		t1.start();
	}
}
