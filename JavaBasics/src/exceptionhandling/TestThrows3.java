package exceptionhandling;

import java.io.IOException;

class Demo
{
	void m1()throws IOException
	{
		throw new IOException("Device operation performed...");
		
	}
}

public class TestThrows3
{
	public static void main(String[] args) throws IOException 
	{
		Demo obj=new Demo();
		obj.m1();
		
		System.out.println("Normal flow");

	}

}
