package com.tns.streamapi;

import java.util.ArrayList;
import java.util.List;

class Product6
{
	int id;
	String name;
	float price;
	
	public Product6(int id,String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class JavaStreamExample6
{
	public static void main(String[] args) 
	{
		List<Product6> productList=new ArrayList<Product6>();
		
		productList.add(new Product6(1,"HP Laptop",25000f));
		productList.add(new Product6(2,"Dell Laptop",30000f));
		productList.add(new Product6(3,"Lenovo Laptop",28000f));
		productList.add(new Product6(4,"Sony Laptop",28000f));
		productList.add(new Product6(5,"Apple Laptop",90000f));
		
		long count=productList.stream().filter(product ->product.price<90000).count();
		System.out.println(count);
}
}