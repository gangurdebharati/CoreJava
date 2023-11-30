package demo;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name, age and salary :");
		String name=sc.nextLine();
		int age=sc.nextInt();
		double salary=sc.nextDouble();
		
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Salary is :"+salary);

	}

}
