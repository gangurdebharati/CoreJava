package collectionframework;
import java.util.*;

public class StackEmptyMethodEx 
{
	public static void main(String[] args)
	{
		Stack<Integer> stk=new Stack<Integer>();
		
		boolean result=stk.empty();
		
		System.out.println("Is the stack empty :"+result);
		
		stk.push(12);
		stk.push(23);
		stk.push(14);
		stk.push(25);
		
		System.out.println("Elements in stack :"+stk);
		
		result=stk.empty();
		
		System.out.println("Is the stack empty :"+result);

	}

}
