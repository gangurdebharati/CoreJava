package multithreading;

public class ThreadPriorityEx1 extends Thread
{
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(15);
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
	}

}
