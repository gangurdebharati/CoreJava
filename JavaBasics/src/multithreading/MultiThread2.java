package multithreading;

public class MultiThread2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is in running state");
	}
	public static void main(String[]args)
	{
		MultiThread2 obj=new MultiThread2();
		Thread t1=new Thread(obj);
		t1.start();
	}

}
