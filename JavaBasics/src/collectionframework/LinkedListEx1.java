package collectionframework;

import java.util.*;

public class LinkedListEx1 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ls=new LinkedList<String>();
		
		ls.add("Tom");
		ls.add("Jerry");
		ls.add("Merry");
		ls.add("John");
		
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
