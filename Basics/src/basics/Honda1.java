package basics;

 class Bike{
	 void show()
	 {
		 System.out.println("Hello");
	 }
 }  

class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda1 honda= new Honda1();  
  honda.run();  
  honda.show();
  }  
}  