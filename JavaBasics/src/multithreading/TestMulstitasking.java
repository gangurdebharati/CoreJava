package multithreading;

public class TestMulstitasking extends Thread
{
	public void run()
	{
		System.out.println("Task One");
	}
	public static void main(String[] args)
	{
		TestMulstitasking t1=new TestMulstitasking();
		TestMulstitasking t2=new TestMulstitasking();
		TestMulstitasking t3=new TestMulstitasking();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
