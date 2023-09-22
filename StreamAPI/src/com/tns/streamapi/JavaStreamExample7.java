package com.tns.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product7
{
	int id;
	String name;
	float price;
	
	public Product7(int id,String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class JavaStreamExample7
{
	public static void main(String[] args) 
	{
		List<Product7> productList=new ArrayList<Product7>();
		
		productList.add(new Product7(1,"HP Laptop",25000f));
		productList.add(new Product7(2,"Dell Laptop",30000f));
		productList.add(new Product7(3,"Lenovo Laptop",28000f));
		productList.add(new Product7(4,"Sony Laptop",28000f));
		productList.add(new Product7(5,"Apple Laptop",90000f));
		
		Map<Integer,String> productPriceMap=productList.stream().collect(Collectors.toMap(p ->p.id, p ->p.name));
		System.out.println(productPriceMap);
}
}