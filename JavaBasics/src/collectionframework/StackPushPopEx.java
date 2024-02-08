package collectionframework;
import java.util.*;

public class StackPushPopEx 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stk=new Stack();
		
		stk.push(12);
		stk.push(35);
		stk.push(66);
		stk.push(11);
		stk.push(76);
		
		System.out.println("Stack is :"+stk);
		
		stk.pop();
		
		System.out.println("After applying pop() method :"+stk);

	}

}
