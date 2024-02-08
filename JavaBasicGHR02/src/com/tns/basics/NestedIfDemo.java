package com.tns.basics;

public class NestedIfDemo 
{
	public static void main(String[] args) 
	{
		int x=30,y=10;
		
		if(x==40)
		{
			if(y==12)
			{
				System.out.println("The value of x=30 and y=10");
			}
			else
			{
				System.out.println("The value of x=30 and y=12");
			}
		}
		else
		{
			System.out.println("The value of x=40");
		}

	}

}
