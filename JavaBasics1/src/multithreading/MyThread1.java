package multithreading;

public class MyThread1 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread("My first thread");
		t1.start();
		
		String str=t1.getName();
		System.out.println(str);

	}

}
