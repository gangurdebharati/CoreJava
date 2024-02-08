package exceptionhandling;

public class FinalizeExample 
{
	public static void main(String[] args) 
	{
		FinalizeExample obj=new FinalizeExample();
		System.out.println("Hashcode is :"+obj.hashCode());
		
		obj=null;
		
		System.gc();
		System.out.println("End of the garbage collection...");

	}
	protected void finalize()
	{
		System.out.println("Called the finalize() method...");
	}

}
