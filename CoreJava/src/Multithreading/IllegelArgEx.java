package Multithreading;

public class IllegelArgEx extends Thread
{
	public static void main(String[]args)
	{
		Thread.currentThread().setPriority(10);
		
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
	}
}
