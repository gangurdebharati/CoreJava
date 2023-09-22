package com.tns.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product2
{
	int id;
	String name;
	float price;
	
	public Product2(int id,String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class JavaStreamExample2
{
	public static void main(String[] args) 
	{
		List<Product2> productList=new ArrayList<Product2>();
		
		productList.add(new Product2(1,"HP Laptop",25000f));
		productList.add(new Product2(2,"Dell Laptop",30000f));
		productList.add(new Product2(3,"Lenovo Laptop",28000f));
		productList.add(new Product2(4,"Sony Laptop",28000f));
		productList.add(new Product2(5,"Apple Laptop",90000f));
		
		List<Float> productPriceList2=productList.stream().filter(p ->p.price>30000).map(p ->p.price).collect(Collectors.toList());
		System.out.println(productPriceList2);
		


	}

}
