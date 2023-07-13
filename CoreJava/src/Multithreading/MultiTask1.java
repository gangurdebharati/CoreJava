package Multithreading;

public class MultiTask1 extends Thread
{
	public void run()
	{
		System.out.println("Task one");
	}
	public static void main(String[]args)
	{
		MultiTask1 t1=new MultiTask1();
		MultiTask1 t2=new MultiTask1();
		MultiTask1 t3=new MultiTask1();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
