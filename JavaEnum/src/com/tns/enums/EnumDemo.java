package com.tns.enums;
enum Level
{
	LOW,
	MEDIUM,
	HIGH
}
public class EnumDemo
{
	public static void main(String[] args) 
	{
		for(Level myVar:Level.values())
		{
	     System.out.println(myVar);
		}
	}
}
