package collectionframework;
import java.util.*;

public class StackPushPopEx
{
	public static void main(String[] args) 
	{
		Stack<Integer> stk=new Stack<Integer>();
		
		stk.push(12);
		stk.push(44);
		stk.push(11);
		stk.push(66);
		stk.push(88);
		
		System.out.println("Stack elements are :"+stk);
		
		stk.pop();
		
		System.out.println("After using pop() method :"+stk);

	}

}
