package collectionframework;
import java.util.*;

public class ArrayDequeEx2
{
	public static void main(String[] args) 
	{
		Deque<String> deque=new ArrayDeque<String>();
		
		deque.offer("Tom");
		deque.offer("John");
		deque.offer("Jerry");
		deque.offer("Mike");
		
		System.out.println("After offerFirst Traversal...");
		
		for(String s:deque)
		{
			System.out.println(s);
		}
		
		deque.pollLast();
		System.out.println("After pollLasr() Traversal...");
		
		for(String s:deque)
		{
			System.out.println(s);
		}

	}

}
