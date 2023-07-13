package basics;
import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {

		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the elements in first matrix :");
		
		for(int i=0;i<2;i++)//row
		{
			for(int j=0;j<2;j++)//column
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements in second matrix :");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
       
		
		
		System.out.println("---First Matrix---");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(a[i][j]+" ");
			}
		}
		
		System.out.println("---Second Matrix---");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(b[i][j]+" ");
			}
		}
		
		
		System.out.println("Addition of two matrix");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.println(c[i][j]+" ");
			}
		}
		sc.close();
	}
	

}
