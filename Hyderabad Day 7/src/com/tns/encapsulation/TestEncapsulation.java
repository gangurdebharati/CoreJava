package com.tns.encapsulation;

public class TestEncapsulation 
{
	public static void main(String[] args) 
	{
		Account a=new Account();
		
		a.setAcc_no(609876525);
		a.setName("Emam");
		a.setEmail("emam12@gmail.com");
		a.setAmount(50790.67f);
		
		System.out.println("Account No is :" +a.getAcc_no()+" Name of the account holder is: "+a.getName()+" Email id of account holder is: "+a.getEmail()+" balance is: "+a.getAmount());

	}

}
