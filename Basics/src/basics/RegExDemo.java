package basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo 
{	
  public static void main(String[] args)
  {
    Pattern pattern = Pattern.compile("FOUNDATION",Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("foundation");
    
    boolean matchFound = matcher.find();
    
    if(matchFound)
    {
      System.out.println("Match found");
    } 
    else
    {
      System.out.println("Match not found");
    }
  }
}

