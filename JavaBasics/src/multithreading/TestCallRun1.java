package multithreading;

public class TestCallRun1 extends Thread
{
	public void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args) 
	{
		TestCallRun1 obj=new TestCallRun1();
		obj.run();
	}

}
