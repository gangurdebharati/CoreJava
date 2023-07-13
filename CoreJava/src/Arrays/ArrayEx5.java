package Arrays;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int b[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value in First Array :");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("First Array Elemets :");
		
	    for(int i=0;i<5;i++)
	    {
	    	System.out.println(a[i]+" ");
	    }
		System.out.println("\n Second Array Element :");
		
		for(int i=0;i<5;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]+" ");
		}

	}

}
