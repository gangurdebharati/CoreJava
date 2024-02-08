package multithreading;

public class TestMultiNaming extends Thread
{
	public void run()
	{
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) 
	{
		TestMultiNaming t1=new TestMultiNaming();
		TestMultiNaming t2=new TestMultiNaming();
		
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("Piyush");
		System.out.println("After chnaging name of t1:"+t1.getName());

	}

}
