package basics;
import java.util.Scanner;


interface Client
{
	void input();
	void output();
}
public class Developer implements Client
{
	String name;
	double salary;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		name=sc.nextLine();
		
		System.out.println("Enter Salary :");
		salary=sc.nextDouble();
	}
	public void output()
	{
		System.out.println(name+" "+salary);
	}
	public static void main(String[]args)
	{
		Developer d=new Developer();
		d.input();
		d.output();
	}

}
