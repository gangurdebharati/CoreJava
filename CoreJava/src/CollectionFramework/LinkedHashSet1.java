package CollectionFramework;
import java.util.*;
public class LinkedHashSet1 {

	
	public static void main(String[] args) 
	{
		LinkedHashSet set=new LinkedHashSet();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		 Iterator i=set.iterator();
		 
		  while(i.hasNext()) 
		  {
			  System.out.println(i.next()); 
		  }
		 
	}

}
