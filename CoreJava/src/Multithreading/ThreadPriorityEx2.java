package Multithreading;

public class ThreadPriorityEx2 extends Thread
{
	public static void main(String[]args)
	{
		Thread.currentThread().setPriority(11);
		
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
	}

}
