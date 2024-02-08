package collectionframework;

import java.util.*;
public class ArrayDequeEx1
{
	public static void main(String[] args) 
	{
		Deque<String> deque=new ArrayDeque<String>();
		
		deque.add("Tom");
		deque.add("Jerry");
		deque.add("John");
		deque.add("Mike");
		
		for(String str:deque)
		{
			System.out.println(str);
		}

	}

}
