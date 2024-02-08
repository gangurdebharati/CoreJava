package multithreading;

public class ThreadPriorityEx2 extends Thread
{
	public void run()
	{
		System.out.println("Inside the run() method");
	}
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(7);
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
		
		ThreadPriorityEx2 t1=new ThreadPriorityEx2();
		System.out.println("Priority of the thread t1 is: "+t1.getPriority());
	}

}
