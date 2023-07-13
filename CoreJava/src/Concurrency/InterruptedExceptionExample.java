package Concurrency;

class ChildThread extends Thread 
{
    public void run() 
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.err.println("InterruptedException caught!");
            e.printStackTrace();
        }
    }
}

public class InterruptedExceptionExample 
{
    public static void main(String[] args) throws InterruptedException
    {
        ChildThread childThread = new ChildThread();
        childThread.start();
        childThread.interrupt();
    }
}