package com.tns.variables;

public class LocalDemo 
{
	void printAverage(int a,int b)
	{
		int avg=(a+b)/2;
		System.out.println(avg);
	}
	public static void main(String[]args)
	{
		LocalDemo obj=new LocalDemo();
		obj.printAverage(100, 200);
	}

}
