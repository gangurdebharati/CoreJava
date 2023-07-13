package Multithreading;
//By implementing Runnable interface
public class ThreadImpR implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running....");
	}
	public static void main(String[]args)
	{
		ThreadImpR obj=new ThreadImpR();
		Thread t1=new Thread(obj);
		t1.start();
	}

}
