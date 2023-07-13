package basics;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element in array: ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		System.out.println("Lenght of the arraty is :"+a.length);
		
	}

}
