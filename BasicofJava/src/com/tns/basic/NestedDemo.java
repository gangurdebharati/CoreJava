package com.tns.basic;

public class NestedDemo 
{
	public static void main(String[] args) 
	{
		int x=30,y=10;
		if(x==40)
		{
			if(y==12)
			{
				System.out.println("x=30 and y=10;");
			}
			else
			{
				System.out.println("x=30 but y is not equal to 10");
			}
		}
		else
		{
			System.out.println("x is not equal to 30 and y is not equal to 10");
		}

	}

}
