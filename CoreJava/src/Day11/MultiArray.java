package Day11;
import java.util.Scanner;

public class MultiArray 
{
	public static void main(String[]args)
	{
		int a[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements :");
		
		for(int i=0;i<2;i++)//row
		{
			for(int j=0;j<2;j++)//column
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix :");
		
		for(int i=0;i<2;i++)//row
		{
			for(int j=0;j<2;j++)//column
			{
				System.out.println(a[i][j]+" ");	
			}
			
			System.out.println("\n");
		}
		
		
	} 
}
