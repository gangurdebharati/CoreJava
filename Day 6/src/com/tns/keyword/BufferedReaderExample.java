package com.tns.keyword;
import java.io.*;

public class BufferedReaderExample 
{
	public static void main(String[] args) throws IOException 
	{
	   InputStreamReader r=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(r);
       System.out.println("Enter your name :");
       String name=br.readLine();
       System.out.println("Welcome "+name);
	}

}
