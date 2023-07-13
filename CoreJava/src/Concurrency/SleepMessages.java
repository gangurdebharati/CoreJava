package Concurrency;

public class SleepMessages
{
	public static void main(String[] args)throws InterruptedException
	{
		String importantinfo[]=
			{
					"Jonny Jonny",
					"Yess Papa...",
					"eating sugar?",
					"No,Papa",
					"telling lies?",
					"No,Papa",
					"open your mouth",
					"Ha ha haaaa...."
			};

		for(int i=0;i<importantinfo.length;i++)
		{
			Thread.sleep(5000);
			System.out.println(importantinfo[i]);
		}
	}

}
