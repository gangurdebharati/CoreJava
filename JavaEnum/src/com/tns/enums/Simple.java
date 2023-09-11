package com.tns.enums;
enum Level
{
	LOW,
	MEDIUM,
	HIGH
}
public class Simple
{
	public static void main(String[]args)
	{
		Level obj=Level.HIGH;	
		switch(obj)
		{
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		}
	}
}
