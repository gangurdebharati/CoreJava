package Multithreading;
//By extending Thread class
public class Mutli extends Thread
{
	public void run()
	{
		System.out.println("Thread is running...");
	}
	public static void main(String[]args)
	{
		Mutli obj=new Mutli();
		obj.start();
		
	}

}
