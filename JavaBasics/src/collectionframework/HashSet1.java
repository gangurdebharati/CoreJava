package collectionframework;

import java.util.*;

public class HashSet1
{
	public static void main(String[] args) 
	{
		HashSet<String> set=new HashSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Three");
		
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
