package Day11;
import java.util.Scanner;

public class AddArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in Array");
		
		for(int i=0;i<5;i++)//reading the value from user
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elemets :");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			sum=a[i]+sum;
		}
		System.out.println("\n Addition of array elements :"+sum);
	}

}
