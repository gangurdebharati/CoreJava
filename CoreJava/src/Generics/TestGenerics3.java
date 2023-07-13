package Generics;

public class TestGenerics3
{  
	  
	   public static < E > void printArray(E[] elements) 
	   {  
	        for ( E element : elements)
	        {          
	            System.out.println(element );  
	        }  
	         System.out.println();  
	    }  
	    public static void main( String args[] ) 
	    {  
	        Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'F', 'O', 'U', 'N', 'D','A','T','I','O','N' };  
	  
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray  );   
	  
	       System.out.println( "Printing Character Array" );  
	        printArray( charArray );   
	    }   
	}  
