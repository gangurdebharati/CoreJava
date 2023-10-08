package com.tns.lambdaexpression;

import java.util.*;

public class LambaExpressionExample5
{
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		
		list.add("Yash");
		list.add("Prathamesh");
		list.add("Shubham");
		list.add("Sabir");
		list.add("Gaurav");
		
		list.forEach((n)->System.out.println(n));

	}

}
