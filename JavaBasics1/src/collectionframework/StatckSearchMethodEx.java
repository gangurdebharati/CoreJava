package collectionframework;
import java.util.*;
public class StatckSearchMethodEx
{
	public static void main(String[] args) 
	{
		Stack<String> stk=new Stack<String>();
		
		stk.push("HP");
		stk.push("Dell");
		stk.push("Mac Book");
		stk.push("Asus");
		
		System.out.println("Stack :"+stk);
		
		int location=stk.search("HP");
		System.out.println("Location of HP is :"+location);
		
		int x=stk.size();
		System.out.println("The siz eof stack is :"+x);

	}

}
