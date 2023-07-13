package basics;

public class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("This thread is running...");
	}
	public static void main(String[]args)
	{
		ThreadDemo obj=new ThreadDemo();
		obj.run();
	}
}
