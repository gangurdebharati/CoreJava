package com.tns.basic;

public class LogicalOp 
{
	public static void main(String[] args)
	{
		boolean bool1=true,bool2=false;
		
		//logical AND
		System.out.println("boo1 && bool2"+(bool1&&bool2));
		//logical OR
		System.out.println("bool||bool2"+(bool1||bool2));
		//Logical NOT
		System.out.println("!(bool1&&bool2)"+!(bool1&&bool2));
	

	}

}
