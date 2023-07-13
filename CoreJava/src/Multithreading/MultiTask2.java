package Multithreading;

 class Task1 extends Thread
{
	public void run()
	{
		System.out.println("Task one");
	}
}

class Task2 extends Thread
{
	public void run()
	{
		System.out.println("Task two");
	}
}
class MultiTask2
{
	public static void main(String[]args)
	{
		Task1 t1=new Task1();
		Task2 t2=new Task2();
		
		t1.start();
		t2.start();
	}
}
