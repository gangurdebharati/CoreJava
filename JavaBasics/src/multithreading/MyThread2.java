package multithreading;

public class MyThread2 implements Runnable
{
	public void run()
	{
		System.out.println("Now the thread is running...");
	}
	public static void main(String[]args)
	{
		Runnable r1=new MyThread2();
		
		Thread th1=new Thread(r1,"My new thread");
		
		th1.start();
		
		String s=th1.getName();
		System.out.println(s);
	}

}
