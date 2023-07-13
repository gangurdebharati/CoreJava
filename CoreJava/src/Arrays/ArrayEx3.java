package Arrays;

import java.util.Scanner;

public class ArrayEx3
{
	public static void main(String[]args)
	{
		int size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Printed Array Elements");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]+ " ");
		}
	}

}
