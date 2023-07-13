package Concurrency;

public class TestThread 
{
	static class Counter 
	{
	      private int c = 0;

	      public void increment()
	      {
	         c++;
	      }
	      public int value() 
	      {
	         return c;
	      }
	   }
	   
	   public static void main(final String[] arguments) throws InterruptedException
	   {
	      final Counter counter = new Counter();
	      
	      for(int i=1;i<=1000;i++) 
	      {
	         new Thread(new Runnable() 
	        	{
	            public void run() 
	            {
	               counter.increment();
	            }
	         }).start(); 
	      }  
	      Thread.sleep(1000);
	      
	      System.out.println("Final number (should be 1000): " + counter.value());
	   }  
	}