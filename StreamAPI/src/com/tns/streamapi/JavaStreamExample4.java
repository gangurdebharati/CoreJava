package com.tns.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product4
{
	int id;
	String name;
	float price;
	
	public Product4(int id,String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class JavaStreamExample4
{
	public static void main(String[] args) 
	{
		List<Product4> productList=new ArrayList<Product4>();
		
		productList.add(new Product4(1,"HP Laptop",25000f));
		productList.add(new Product4(2,"Dell Laptop",30000f));
		productList.add(new Product4(3,"Lenovo Laptop",28000f));
		productList.add(new Product4(4,"Sony Laptop",28000f));
		productList.add(new Product4(5,"Apple Laptop",90000f));

		double totalPrice=productList.stream().collect(Collectors.summingDouble(product ->product.price));
		System.out.println(totalPrice);

	}

}
