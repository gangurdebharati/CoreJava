package Multithreading;

public class DaemonDemo extends Thread
{
	public void run() 
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread working");
		}
		else
		{
			System.out.println("User thread working");
		}
	}
	public static void main(String[]args)
	{
		DaemonDemo t1=new DaemonDemo();
		DaemonDemo t2=new DaemonDemo();
		DaemonDemo t3=new DaemonDemo();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
