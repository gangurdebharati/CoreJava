package multithreading;

public class TestDaemonThread1 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread");
		}
		else
		{
			System.out.println("User Thread");
		}
	}

	public static void main(String[] args) 
	{
		TestDaemonThread1 t1=new TestDaemonThread1();
		TestDaemonThread1 t2=new TestDaemonThread1();
		TestDaemonThread1 t3=new TestDaemonThread1();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
