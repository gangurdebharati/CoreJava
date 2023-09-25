package com.tns.annotation;

import java.util.*;

public class TestAnnotation2 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("Peter");
		list.add("Tom");
		list.add("John");
		list.add("Micky");
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
}
