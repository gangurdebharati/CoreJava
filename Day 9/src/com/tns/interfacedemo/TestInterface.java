package com.tns.interfacedemo;

class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.15f;
	}
}
class BOI implements Bank
{
	public float rateOfInterest()
	{
		return 7.5f;
	}
}
public class TestInterface 
{
	public static void main(String[] args)
	{
      SBI s=new SBI();
      System.out.println("Rate of interest of SBI bank is "+s.rateOfInterest());
      
      BOI b=new BOI();
      System.out.println("Rate of interest of BOI bank is "+b.rateOfInterest());

	}

}
