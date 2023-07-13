package basics;

public class TestThrow1 {   
    //function to check if person is eligible to vote or not   
		  static void checkAge(int age) 
		  { 
		    if (age < 18) 
		    {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
		    }
		    else 
		    {
		      System.out.println("Access granted - You are old enough!"); 
		    }
		 } 
		 
		 public static void main(String[] args) 
		 { 
		   checkAge(15); 
		 } 
		}