package com.tns.lambdaexpression;

public class LambdaExpressionExample
{
	public static void main(String[] args) 
	{
		int width=10;
		
		/*
		 * Drawable d=new Drawable() 
		 * {
		 *  public void draw() 
		 *  {
		 *     System.out.println("Drawing "+width);
		 *  }
		 * }; 
		 * d.draw();
		 */
		Drawable d=()->{
			System.out.println("Drawing "+width);
		};
		
		d.draw();
	}

}
