package Multithreading;

public class ThreadName extends Thread
{
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String[]args)
	{
		ThreadName obj=new ThreadName();
		
		System.out.println("Name of the thread :"+obj.getName());
		
		obj.start();
		
		obj.setName("Tom");
		System.out.println("After changing name of the thread :"+obj.getName());
	}

}
