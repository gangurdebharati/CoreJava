package multithreading;

public class TestMultiNaming2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{ 
		TestMultiNaming2 t1=new TestMultiNaming2();
		
		
		t1.start();
	
	} 

}
