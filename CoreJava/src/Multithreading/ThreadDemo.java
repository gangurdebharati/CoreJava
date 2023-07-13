package Multithreading;

public class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("running");
	}
	
	public static void main(String[]args)
	{
		ThreadDemo obj=new ThreadDemo();
		
		obj.start();
		obj.start();
		
		
	}
}
