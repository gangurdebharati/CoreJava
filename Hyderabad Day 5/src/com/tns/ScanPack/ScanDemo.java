package com.tns.ScanPack;

import java.util.Scanner;

public class ScanDemo 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter you name, age and Salary :");
	   
	  String name=sc.nextLine();
	  int age=sc.nextInt();
	  double salary=sc.nextDouble();
	  
	  System.out.println("Name :"+name);
	  System.out.println("Age :"+age);
	  System.out.println("Salary :"+salary);
	}
}
