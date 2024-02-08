package multithreading;

public class TestCallRun extends Thread
{
	public void run()
	{
		System.out.println("Running...");
	}
	public static void main(String[] args) 
	{
		TestCallRun t1=new TestCallRun();
		t1.run();

	}

}
