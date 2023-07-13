package basics;
import java.util.Scanner;

public class ArrayDemo1 
{
	public static void main(String[]args)
	{
		int a[][]=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements :");
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix");
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println("\n");
		}
		
	}

}
