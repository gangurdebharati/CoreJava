package collectionframework;
import java.util.*;

public class LinkedHashSet 
{
	public static void main(String[] args) 
	{
       Set<String> set=(Set<String>) new LinkedHashSet();
		
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
