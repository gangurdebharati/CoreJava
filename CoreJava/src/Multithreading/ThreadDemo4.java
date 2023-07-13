package Multithreading;

public class ThreadDemo4 implements Runnable
{
	public void run()
	{
		System.out.println("Now the thread is running....");
	}
	public static void main(String[]args)
	{
		Runnable obj=new ThreadDemo4();
		
		Thread t1=new Thread(obj,"My new thread");
		
		t1.start();
		
		String str=t1.getName();
		System.out.println(str);
		}

}
