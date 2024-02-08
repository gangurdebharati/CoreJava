package collectionframework;
import java.util.*;

public class PrioritQueueyEx 
{
	public static void main(String[] args)
	{
		Queue<String> queue=new PriorityQueue();
		
		queue.add("Apple");
		queue.add("Mango");
		queue.add("Kiwi");
		queue.add("Watermelon");
		queue.add("Grapes");
		
		System.out.println("Head :"+queue.element());
		System.out.println("Head :"+queue.peek());
		System.out.println("Iterating the queue elements :");
		
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		queue.poll();
		
		System.out.println("After removing two elements :"+queue);
		
		
		
		
		
		

	}

}
