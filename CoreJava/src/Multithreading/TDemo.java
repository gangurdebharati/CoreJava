package Multithreading;

public class TDemo extends Thread
{
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String[]args)
	{
		TDemo obj=new TDemo();
		obj.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread");
		}
	}
}
