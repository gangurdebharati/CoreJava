package Multithreading;

public class TestSleepm1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[]args)
	{
		TestSleepm1 t1=new TestSleepm1();
		TestSleepm1 t2=new TestSleepm1();
		TestSleepm1 t3=new TestSleepm1();
		
		t1.start();
		t1.start();
		t2.start();
		t3.start();
	}
}
