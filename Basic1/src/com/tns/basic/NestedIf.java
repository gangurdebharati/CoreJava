package com.tns.basic;

public class NestedIf
{
	public static void main(String[] args)
	{
	   int x=30,y=10;
	   if(x==30) 
	   {
		   if(y==11)
		   {
			  System.out.println("Value of x is 30 and value of y is 10"); 
		   }
		   else
		   {
			   System.out.println("Value of y is not 10");
			   
		   }
	   }
	   else
	   {
		   System.out.println("Value of x is not 30");
	   }

	}

}
