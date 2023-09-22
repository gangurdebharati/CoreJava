package com.tns.streamapi;

import java.util.ArrayList;
import java.util.List;

class Product3
{
	int id;
	String name;
	float price;
	
	public Product3(int id,String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class JavaStreamExample3
{
	public static void main(String[] args) 
	{
		List<Product3> productList=new ArrayList<Product3>();
		
		productList.add(new Product3(1,"HP Laptop",25000f));
		productList.add(new Product3(2,"Dell Laptop",30000f));
		productList.add(new Product3(3,"Lenovo Laptop",28000f));
		productList.add(new Product3(4,"Sony Laptop",28000f));
		productList.add(new Product3(5,"Apple Laptop",90000f));
		
		productList.stream().filter(product ->product.price==30000).forEach(product ->System.out.println(product.name));
}}