package Multithreading;

public class ThreadDemo1 extends Thread 
{
	public void run()
	{
		System.out.println("Thread is running...");
	}
	
	public static void main(String[]args)
	{
		ThreadDemo1 obj=new ThreadDemo1();
		obj.start();
	}

}
