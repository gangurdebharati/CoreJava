package collectionframework;
import java.util.*;

public class LinkedListEx1
{
	public static void main(String[] args)
	{
		LinkedList<String> al=new LinkedList<String>();
		
		al.add("Mango");
		al.add("Grapes");
		al.add("Apple");
		al.add("Watermelon");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
