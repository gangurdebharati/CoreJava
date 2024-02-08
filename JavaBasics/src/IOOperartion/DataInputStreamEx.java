package IOOperartion;

import java.io.*;
public class DataInputStreamEx 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\thirt\\OneDrive\\Documents\\testout.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

