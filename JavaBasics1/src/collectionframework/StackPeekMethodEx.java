package collectionframework;
import java.util.*;
public class StackPeekMethodEx 
{
	public static void main(String[] args) 
	{
		Stack<String> stk=new Stack<String>();
		
		stk.push("Apple");
		stk.push("Banana");
		stk.push("Mango");
		stk.push("Orange");
		stk.push("Watermelon");
		
		System.out.println("Stack :"+stk);
		
		String fruit=stk.peek();
		
		System.out.println("Element at top :"+fruit);
		

	}

}
