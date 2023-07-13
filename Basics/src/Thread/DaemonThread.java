package Thread;

	class DaemonThread extends Thread
	{  
		 public void run()
		 {  
		  System.out.println("Name: "+Thread.currentThread().getName());  
		  System.out.println("Daemon: "+Thread.currentThread().isDaemon()); 
		  
		 }  
		 public static void main(String[] args)
		 {  
			 DaemonThread t1=new DaemonThread();  
			 DaemonThread t2=new DaemonThread();  
			 
		  t1.start();  
		  t2.setDaemon(true); 
		  t2.start();
		 
		
		 }  
		}  


