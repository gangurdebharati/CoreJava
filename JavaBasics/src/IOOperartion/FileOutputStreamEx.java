package IOOperartion;

import java.io.*;

public class FileOutputStreamEx 
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("C:\\Users\\thirt\\OneDrive\\Documents\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
