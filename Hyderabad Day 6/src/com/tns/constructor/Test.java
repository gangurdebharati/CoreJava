package com.tns.constructor;

class S
{
	S getS()
	{
		return this;
	}
	void msg()
	{
		System.out.println("Welcome to TNS");
	}
}
public class Test {

	public static void main(String[] args) {
		
		new S().getS().msg();

	}

}
