package Arrays;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		int a[]=new int[3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in array:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("\n Array length is :"+a.length);
		

	}

}
