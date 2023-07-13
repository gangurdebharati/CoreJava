package Multithreading;

public class MyThreadDemo implements Runnable 
{
	public void run()
	{
		System.out.println("Now the thread is running");
	}
	
	public static void main(String[]args)
	{
		Runnable obj=new MyThreadDemo();
		
		Thread t=new Thread(obj,"My new thread");
		
		t.start();
		
		String str=t.getName();
		System.out.println(str);
	}
}
