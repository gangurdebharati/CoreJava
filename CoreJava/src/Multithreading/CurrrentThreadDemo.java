package Multithreading;

public class CurrrentThreadDemo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[]args)
	{
		CurrrentThreadDemo t1=new CurrrentThreadDemo();
		CurrrentThreadDemo t2=new CurrrentThreadDemo();
		
		t1.start();
		t2.start();
	}

}
