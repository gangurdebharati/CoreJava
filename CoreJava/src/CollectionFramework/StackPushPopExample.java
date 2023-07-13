package CollectionFramework;

import java.util.*;
	 
	public class StackPushPopExample 
	{
	    public static void main(String args[])
	    {
	        Stack<String> s = new Stack<String>();
	 
	        s.push("Welcome");
	        s.push("To");
	        s.push("TNS");
	        s.push("India");
	        s.push("Foundation");
	        
	        System.out.println("Initial Stack: " + s);
	        
	        System.out.println("Popped element: " +s.pop());
	        System.out.println("Popped element: " +s.pop());
	        
	        System.out.println("Stack after pop operation "+ s);
	    }
	}