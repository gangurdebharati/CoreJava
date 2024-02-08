package multithreading;

public class WorkerThread implements Runnable
{
	private String message;
	
	public WorkerThread(String s)
	{
		this.message=s;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ " (Start)message ="+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+" (End)");
	}
		private void processmessage()
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

