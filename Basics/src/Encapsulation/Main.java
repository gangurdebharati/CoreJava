package Encapsulation;

public class Main
{
	public static void main(String[] args)
	{
		Cars obj=new Cars("X-presso", 5000000, 300);
		
		System.out.println("---Before Updataion---");
		
		System.out.println("Name of the car :"+obj.getName());
	    System.out.println("Price of the cars :"+obj.getPrice());
	    System.out.println("topspeed of the car is :"+obj.getTopspeed());
	    
		System.out.println("---After Updatation---");
		
		obj.setName("X-presso Pro");
		obj.setPrice(6000000);
		obj.setTopspeed(600);
		
		System.out.println("Name of the car :"+obj.getName());
	    System.out.println("Price of the cars :"+obj.getPrice());
	    System.out.println("topspeed of the car is :"+obj.getTopspeed());
		}
	}


