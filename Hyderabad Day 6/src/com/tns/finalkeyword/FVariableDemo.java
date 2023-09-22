package com.tns.finalkeyword;

public class FVariableDemo 
{
	final int a=10;
	
	void input()
	{
		a=20;
	}

	public static void main(String[] args)
	{
		FVariableDemo obj=new FVariableDemo();
		obj.input();

	}

}
