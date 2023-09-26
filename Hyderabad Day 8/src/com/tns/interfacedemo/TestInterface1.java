package com.tns.interfacedemo;

interface Bank
{
	float rateOfInterest();
}
class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.5f;
	}
}
class AXIS implements Bank
{
	public float rateOfInterest()
	{
		return 9.9f;
	}
}

public class TestInterface1 
{
	public static void main(String[] args)
	{
	 Bank s=new SBI();
	 System.out.println("Rate of interest of SBI bank is :"+s.rateOfInterest()); 
	  
	  Bank a=new AXIS();
      System.out.println("Rate of interest of AXIS bank is :"+a.rateOfInterest());
	}

}
