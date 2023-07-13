package Arrays;
import java.util.Scanner;
public class ArrayEx8 {

	public static void main(String[] args) {
		
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in first matrix :");
		
		for(int i=0;i<2;i++)//rows
		{
			for(int j=0;j<2;j++)//columns
			{
				a[i][j]=sc.nextInt();
			}	
		}
		
		System.out.println("Enter the elements in second matrix :");
		
		for(int i=0;i<2;i++)//rows
		{
			for(int j=0;j<2;j++)//columns
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("---First Matrix---");
		for(int i=0;i<2;i++)//rows
		{
			for(int j=0;j<2;j++)//columns
			{
				System.out.print(a[i][j]+ " ");
			}	
			
			System.out.println("\n");
		}
		
		System.out.println("---Second Matrix ---");
		for(int i=0;i<2;i++)//rows
		{
			for(int j=0;j<2;j++)//columns
			{
				System.out.print(b[i][j]+" ");
			}	
			System.out.println("\n");
		}
		System.out.println("Addition of two matrix :");
		for(int i=0;i<2;i++)//rows
		{
			for(int j=0;j<2;j++)//columns
			{
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.print(c[i][j]+" ");
			}	
			System.out.println("\n");
		}
	

	}

}
