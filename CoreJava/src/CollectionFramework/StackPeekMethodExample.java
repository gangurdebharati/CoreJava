package CollectionFramework;

import java.util.Stack;  

public class StackPeekMethodExample   
{  
public static void main(String[] args)   
{  
Stack<String> stk= new Stack<>();  
  
stk.push("Apple");  
stk.push("Grapes");  
stk.push("Mango");  
stk.push("Orange");  
System.out.println("Stack: " + stk);  
  
String fruits = stk.peek();  
  
System.out.println("Element at top: " + fruits);  

int location=stk.search("Mango");

System.out.println("Location of Mango is :"+location);

boolean e=stk.isEmpty();

System.out.println("Is the stack is empty or not :"+e);

int s=stk.size();

System.out.println("Size of the stack is :"+s);
}  
}  