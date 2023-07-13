package CollectionFramework;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) 
	{
		LinkedList<String> al=new LinkedList<String>();
		
		al.add("Tom");
		al.add("Jerry");
		al.add("Harry");
		al.add("Mike");
		al.add("Tom");
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
