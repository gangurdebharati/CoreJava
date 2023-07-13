package Multithreading;

public class ThreadDemo2 implements Runnable
{
	public void run()
	{
		System.out.println("This thread is running...");
	}

	public static void main(String[]args)
	{
		ThreadDemo2 obj=new ThreadDemo2();
		Thread t1=new Thread(obj);
		t1.start();
	}
}
