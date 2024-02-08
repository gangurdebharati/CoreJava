package collectionframework;
import java.util.*;

public class StatckSearchMethodEx 
{
	public static void main(String[] args) 
	{
		Stack<String> stk=new Stack();
		
		stk.push("Tom");
		stk.push("Jerry");
		stk.push("Merry");
		stk.push("John");
		stk.push("Mike");
		
		System.out.println("Stack is :"+stk);
		
		int location=stk.search("John");
		System.out.println("Location of John is :"+location);

	}

}
