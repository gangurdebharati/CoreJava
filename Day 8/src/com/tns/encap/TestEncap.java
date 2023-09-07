package com.tns.encap;

class SetMethod
{
	private int value; //data hiding
	public void setValue(int x)//data abstraction
	{
	  value =x;	
	}
	public int getValue()
	{
		return value;
	}
}
public class TestEncap 
{
	public static void main(String[] args) 
	{
		SetMethod s=new SetMethod();
		s.setValue(100);
		System.out.println(s.getValue());

	}

}
