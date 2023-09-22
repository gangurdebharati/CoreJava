package com.tns.finalkeyword;

final class Bike
{
	void run()
	{
		System.out.println("This is parent class method");
	}
}
public class Honda extends Bike
{
	void input()
	{
		System.out.println("This is sport bike");
	}
	public static void main(String[] args) 
	{
		Honda d=new Honda();
		d.run();
		d.input();

	}

}
