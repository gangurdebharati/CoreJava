package Day9;
import java.util.*;

interface Client //super
{
	void input(); //public+abstract
	void output(); //public+abstract
	void show();
}

public class Developer implements Client //sub
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
 }
public void output()
{
	System.out.println("Hello, your name is "+name+" and your salary is "+salary);
}
public void show()
{
	System.out.println("This is show method");
}
public static void main(String[]args)
{
	Client d=new Developer();
	d.input();
	d.output();
	d.show();
}
}
