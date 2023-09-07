package com.tns.keyword;

public class Bike 
{
	 final int speedlimit=90;
	 void run() 
	  { 
		 speedlimit=100; 
	  }
	 
	public static void main(String[] args) 
	{
	  Bike obj=new Bike();
	  System.out.println(obj.speedlimit);
	}

}
