package Multithreading;

public class ThreadPriorityEx extends Thread
{
	public void run()
	{
		System.out.println("Inside the run() method");
	}
	public static void main(String[]args)
	{
		ThreadPriorityEx th1=new ThreadPriorityEx();
		ThreadPriorityEx th2=new ThreadPriorityEx();
		ThreadPriorityEx th3=new ThreadPriorityEx();
		
		System.out.println("Priority of the thread th1 is :"+th1.getPriority());
		System.out.println("Priority of the thread th2 is :"+th2.getPriority());
		System.out.println("Priority of the thread th3 is :"+th3.getPriority());
		
		th1.setPriority(6);
		th2.setPriority(3);
		th3.setPriority(9);
		
		System.out.println("Priority of the thread th1 is :"+th1.getPriority());
		System.out.println("Priority of the thread th2 is :"+th2.getPriority());
		System.out.println("Priority of the thread th3 is :"+th3.getPriority());
		
		//main thread
		
		System.out.println("Currently executing the thread:"+Thread.currentThread().getName());
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
	}

}
