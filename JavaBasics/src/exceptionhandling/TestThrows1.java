package exceptionhandling;

import java.io.IOException;

public class TestThrows1 
{
	void m()throws IOException
	{
		throw new IOException("Device Error..");//checked exception
	}
	void n()throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled...");
		}
	}
	public static void main(String[] args) 
	{
		TestThrows1 obj=new TestThrows1();
		obj.p();
		System.out.println("Normal flow...");
	}

}
