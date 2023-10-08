package com.tns.lambdaexpression;

@FunctionalInterface
interface Addable
{
	int add(int a,int b);
}

public class LambaExpressionExample4
{
	public static void main(String[] args)
	{
		Addable ad=(a,b)->(a+b);
		System.out.println(ad.add(10, 20));
		
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(1000, 250));


	}

}
