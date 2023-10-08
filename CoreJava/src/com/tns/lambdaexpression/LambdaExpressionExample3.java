package com.tns.lambdaexpression;

interface Sayable1
{
	public String say(String name);
}

public class LambdaExpressionExample3
{
	public static void main(String[] args) 
	{
		Sayable1 s1=(name)->{
			return "Hello,"+name;
		};
		System.out.println(s1.say("Tom"));
		
		Sayable1 s2=(name)->{
			return "Hello,"+name;
		};
		System.out.println(s2.say("Peter"));
	}

}
