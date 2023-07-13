package CollectionFramework;

import java.util.*;

public class TestPriority {

	public static void main(String[] args) 
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		queue.add("Durga");
		queue.add("Divya");
		queue.add("Manisha");
		queue.add("Roshni");
		queue.add("Neha");
		
		System.out.println("Head :"+queue.element());
		System.out.println("Head :"+queue.peek());
		
		System.out.println("Iterating the queue elements:");
		
		Iterator i=queue.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		queue.remove();
		queue.poll();
		
		System.out.println("After removing two elements from the queue :");
		
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
