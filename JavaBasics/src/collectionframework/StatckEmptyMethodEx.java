package collectionframework;
import java.util.*;

public class StatckEmptyMethodEx 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stk=new Stack();
		
		boolean result=stk.empty();
		
		System.out.println("Is the stack empty? :"+result);
		
		stk.push(34);
		stk.push(23);
		stk.push(12);
		stk.push(25);
		
		System.out.println("Elements is stack :"+stk);
		
		result=stk.empty();
		System.out.println("Is the stack empty? :"+result);

	}

}
