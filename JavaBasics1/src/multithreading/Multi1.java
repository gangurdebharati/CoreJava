package multithreading;

public class Multi1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running...");
	}
	public static void main(String[]args)
	{
		Multi1 t1=new Multi1();
		t1.start();
	}
}
