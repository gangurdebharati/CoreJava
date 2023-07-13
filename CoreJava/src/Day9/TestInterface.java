package Day9;
import java.util.Scanner;

public class TestInterface implements Client1 
{
	String name;
	double salary;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name :");
		name=sc.nextLine();
		System.out.println("Enter your salary :");
		salary=sc.nextDouble();	
		sc.close();
	}
	public void output()
	{
		System.out.println("Hello, welcome "+name+" in TNS India Foundation"+" and you will get "+salary+" here.");
	}
	
	public static void main(String[]args)
	{
		TestInterface obj=new TestInterface();
		obj.input();
		obj.output();
	}
}
