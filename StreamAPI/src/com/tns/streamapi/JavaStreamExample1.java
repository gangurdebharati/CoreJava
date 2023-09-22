package com.tns.streamapi;

import java.util.*;

class Product1
{
	int id;
	String name;
	float price;
	
	public Product1(int id,String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class JavaStreamExample1
{
	public static void main(String[] args) 
	{
		List<Product1> productList=new ArrayList<Product1>();
		
		productList.add(new Product1(1,"HP Laptop",25000f));
		productList.add(new Product1(2,"Dell Laptop",30000f));
		productList.add(new Product1(3,"Lenovo Laptop",28000f));
		productList.add(new Product1(4,"Sony Laptop",28000f));
		productList.add(new Product1(5,"Apple Laptop",90000f));
		
		List<Float> productPriceList=new ArrayList<Float>();
		
		for(Product1 product:productList)
		{
			if(product.price<30000)
			{
				productPriceList.add(product.price);
			}
		}
		System.out.println(productPriceList);

	}

}
