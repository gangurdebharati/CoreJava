package multithreading;

public class MultiThread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running...");
	}
	public static void main(String[]args)
	{
		MultiThread1 obj=new MultiThread1();
		obj.start();
	}
}
