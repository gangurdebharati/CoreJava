package Concurrency;

import java.util.concurrent.atomic.AtomicBoolean;

public class KillThreadUsingFlag implements Runnable
{
private final AtomicBoolean running=new AtomicBoolean(false);
private Thread thread;
@Override
public void run()
{
	while(running.get())
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	System.out.println("Shutting down thread");
}

public void shutdown()
{
	running.set(false);
}
public void start()
{
	thread=new Thread(this);
	thread.start();
}
public static void main(String[]args)throws InterruptedException
{
	KillThreadUsingFlag process=new KillThreadUsingFlag();
	process.start();
	Thread.sleep(8000);
	process.shutdown();
}
	

}
