package basics;
import java.util.*;

class Demo implements Runnable
{
	String name;
	double salary;
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
	}
	void msg()
	{
		System.out.println("This is msg method");
	}
	void input()
	{
		String name;
		double salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		name=sc.nextLine();
		System.out.println("Enter your salary :");
		salary=sc.nextDouble();
		
	}
	void output()
	{
		System.out.println("Welcome "+name+"you got"+salary);
	}
	void show()
	{
		System.out.println("This is show method");
	}
	
}
public class RDemo 
{
	public static void main(String[]args)
	{
		Demo d=new Demo();
		
		d.msg();
		d.input();
		d.output();
		d.show();
		
		Thread t=new Thread(d);
		t.start();
		
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread");
		}
		
		
	}
}
