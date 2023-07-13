package CollectionFramework;
import java.util.*;

public class DequeExample1 {

	public static void main(String[] args) 
	{
		Deque<String> deque=new ArrayDeque<String>();
		
		deque.offer("Roger");
		deque.offer("Sakshi");
		deque.add("Priya");
		deque.offerFirst("Prajwal");
		
		System.out.println("After offerFirst Tranversal");
		
		for(String s:deque)
		{
			System.out.println(s);
		}
		
		deque.pollLast();
		System.out.println("After pollLast() Transversal");
		
		for(String s1:deque)
		{
			System.out.println(s1);
				
			}
		}
	}


