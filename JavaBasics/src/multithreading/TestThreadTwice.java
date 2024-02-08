package multithreading;

public class TestThreadTwice extends Thread
{
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String[]args)
	{
		TestThreadTwice t1=new TestThreadTwice();
		t1.start();
		t1.start();
	}

}
