package collectionframework;
import java.util.*;

public class StackPeekMethodEx 
{
	public static void main(String[] args) 
	{
		Stack<String> stk=new Stack();
		
		stk.push("Apple");
		stk.push("Orange");
		stk.push("Watermelon");
		stk.push("Mango");
		
		System.out.println("Stack :"+stk);
		
		String fruit=stk.peek();
		
		System.out.println("Element at top:"+fruit);
		
		

	}

}
