package com.tns.basics;

class Employee
{
	float salary=40567.90f;
}
public class Programmer extends Employee
{
	int bonus=1800;
	
	public static void main(String[]args)
	{
		Programmer p=new Programmer();
		System.out.println("Programmer salary is :"+p.salary);
		System.out.println("Bonus of programmer is :"+p.bonus);
	}
}
