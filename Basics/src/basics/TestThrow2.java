package basics;

import java.io.*;

class TestThrow2
{
  public static void findFile() throws IOException
  {
    // code that may produce IOException
    File newFile=new File("abc.txt");
    FileInputStream stream = new FileInputStream(newFile);
    
  }

  public static void main(String[] args)
  {
    try
    {
      findFile();
    } catch(IOException e)
    {
      System.out.println(e);
    }
  }
}