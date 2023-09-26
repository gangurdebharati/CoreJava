package com.tns.polymorphism;

class Bank
{
	float getRateOfIneterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	float getRateOfIneterest()
	{
		return 8.4f;
	}
}
class ICICI extends Bank
{
	float getRateOfIneterest()
	{
		return 7.3f;
	}
}
class AXIS extends Bank
{
	float getRateOfIneterest()
	{
		return 9.7f;
	}
}
public class TestPolymorphism 
{
	public static void main(String[] args) 
	{
	  Bank b;
	  b=new SBI();
	  System.out.println("SBI Rate of Interest:"+b.getRateOfIneterest());
	  b=new ICICI();
	  System.out.println("ICICI Rate of Interest:"+b.getRateOfIneterest());
	  b=new AXIS();
	  System.out.println("AXIS Rate of Interesr:"+b.getRateOfIneterest());
	}
}
