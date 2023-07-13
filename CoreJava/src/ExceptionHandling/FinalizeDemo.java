package ExceptionHandling;

public class FinalizeDemo {

	public static void main(String[] args) {
		
		FinalizeDemo obj=new FinalizeDemo();
		
		System.out.println("Hashcode is"+obj.hashCode());
		
		obj=null;//gc()
		
		System.gc();
		
		System.out.println("End of the garbage collection");
		
	}

	 protected void finalize()
	 {
		 System.out.println("called the finalize method");
	 }
	
}
