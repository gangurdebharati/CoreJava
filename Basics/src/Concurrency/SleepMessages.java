package Concurrency;

public class SleepMessages 
{
	public static void main(String[] args)throws InterruptedException
	{
		String []importantinfo= 
			{
					"Jonny Jonny",
					"Yess Papa",
					"Eating suger?",
					"No Papa...",
					"telling lies?",
					"No Papa...",
					"Open your mouth",
					"Ha ha ha ha....!"
			};
		for(int i=0;i<importantinfo.length;i++)
		{
			Thread.sleep(4000);
			System.out.println(importantinfo[i]);
		}
	}

}
