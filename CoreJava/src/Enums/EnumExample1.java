package Enums;


public class EnumExample1
{ 
	  enum Level 
	  {
	    LOW,
	    MEDIUM,
	    HIGH
	  }

	  public static void main(String[] args)
	  { 
	    Level myVar = Level.HIGH; 
	    System.out.println(myVar); 
	  } 
	}
