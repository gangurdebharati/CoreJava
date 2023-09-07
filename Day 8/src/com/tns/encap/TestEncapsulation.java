package com.tns.encap;

public class TestEncapsulation 
{
	public static void main(String[] args) 
	{
		Account acc=new Account();
		acc.setAcc_no(609876534);
		acc.setName("Peter");
		acc.setEmail("peter@gmail.com");
		acc.setAmount(56272.7f);
		
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());

	}

}
