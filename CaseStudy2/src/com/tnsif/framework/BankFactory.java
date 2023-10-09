package com.tnsif.framework;


public abstract class BankFactory 
{
	public abstract SavingAcc getNewSavingAccount(int accNo,String accNm, float accBal,boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm, float aaBal,float creditLimit);
}
