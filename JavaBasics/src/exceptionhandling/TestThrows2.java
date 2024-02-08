package exceptionhandling;

import java.io.IOException;

class M
{
	void m1()throws IOException
	{
		throw new IOException("Device Error...");
		
	}
}

public class TestThrows2
{
	public static void main(String[] args) 
	{
		try
		{
			M obj=new M();
			obj.m1();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled...");
		}
		System.out.println("Normal flow");

	}

}
