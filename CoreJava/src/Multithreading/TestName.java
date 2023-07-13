package Multithreading;

public class TestName extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[]args)
	{
		TestName t1=new TestName();
		TestName t2=new TestName();
		TestName t3=new TestName();
		TestName t4=new TestName();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
