package ExceptionHandling;

import java.io.IOException;

public class TestThrows1 
{
	void m() throws IOException
	{
		throw new IOException("Device error");//checked Exception	
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
			System.out.println("exception Handled");
		}
	}	
	public static void main(String[] args) 
	{
		TestThrows1 obj=new TestThrows1();
		obj.p();
		System.out.println("normal flow..");
	}

}

