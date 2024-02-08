package multithreading;

public class ThreadPriorityEx extends Thread
{
	public void run()
	{
		System.out.println("Inside the run()method");
	}
	public static void main(String[] args) 
	{
		ThreadPriorityEx t1=new ThreadPriorityEx();
		ThreadPriorityEx t2=new ThreadPriorityEx();
		ThreadPriorityEx t3=new ThreadPriorityEx();
		
		System.out.println("Priority of the thread t1 is :"+t1.getPriority());
		System.out.println("Priority of the thread t2 is :"+t2.getPriority());
		System.out.println("Priority of the thread t3 is :"+t3.getPriority());
		
		t1.setPriority(6);
		t2.setPriority(3);
		t3.setPriority(9);
		
		System.out.println("Priority of the thread t1 is :"+t1.getPriority());
		System.out.println("Priority of the thread t2 is :"+t2.getPriority());
		System.out.println("Priority of the thread t3 is :"+t3.getPriority());
		
		System.out.println("Currently Executing the Thread :"+Thread.currentThread().getName());
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
		

	}

}
