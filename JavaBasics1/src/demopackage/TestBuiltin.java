package demopackage;

import java.util.Scanner;

public class TestBuiltin
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name, age and salary :");
		String n=sc.nextLine();
		int a=sc.nextInt();
		double s=sc.nextDouble();
		
		System.out.println("Name is :"+n);
		System.out.println("Age is :"+a);
		System.out.println("Salary is :"+s);

	}

}
