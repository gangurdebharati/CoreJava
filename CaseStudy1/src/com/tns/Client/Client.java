package com.tns.Client;


import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client 
{

	public static void main(String[] args)
	{
		ShopFactory sf = new GSShopFactory();
		
		
		PrimeAcc pa = new GSPrimeAcc(321,"Faiz",1000, true);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		
		NormalAcc na = new GSNormalAcc(100,"Pradhnya",2000,100);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
		

	}

}
