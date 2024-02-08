package multithreading;

public class ThreadGroupDemo implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		ThreadGroupDemo runnable=new ThreadGroupDemo();
		
		ThreadGroup th1=new ThreadGroup("Parent ThreadGroup");
		Thread t1=new Thread(th1,runnable,"One");
		t1.start();
		
		Thread t2=new Thread(th1,runnable,"Two");
		t2.start();
		
		Thread t3=new Thread(th1,runnable,"Three");
		t3.start();
		
		System.out.println("Thread Group Name :"+th1.getName());
		th1.list();

	}

}
