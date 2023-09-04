package basics;

class Bike
{  
	final int speedlimit=90;//final variable  
		
		 void run() 
		 {
			 speedlimit=400; 
		}
		 	 public static void main(String args[])
	 {  
	 Bike obj=new  Bike();  
	 System.out.println(obj.speedlimit); 
	 obj.run();
	 }  
	}