package com.tns.staticexample;

public class StaticDemo 
{
	 static int a=10;
	 
	 static void show()
	 {
		System.out.println("Static Method"); 
	 }
	 static
	 {
		 System.out.println("Static Block");
	 }
	 public static void main(String[]args)
	 {
		
		 System.out.println(a);
		 show();
	 }

}
