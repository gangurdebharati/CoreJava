package com.tns.encapsulation;

public class TestEncapsulation 
{	
	public static void main(String[] args) 
	{
		Account acc=new Account();
		acc.setAcc_no(609876579);
		acc.setName("Peter");
		acc.setEmail("peter@gmail.com");
		acc.setAmount(67909.6f);
		
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
		

	}

}
