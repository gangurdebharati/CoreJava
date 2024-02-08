package collectionframework;

import java.util.*;

public class LinkedListEx2 
{
	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<String>();
		
		System.out.println("Initial list of elements :"+ll);
		
		ll.add("Mango");
		ll.add("Apple");
		ll.add("Watermelon");
		ll.add("Kiwi");
		
		System.out.println("After invoking add(E e) method :"+ll);
		ll.add(1,"Pineapple");
		System.out.println("After invoking add(int index,E element) method:"+ll);
		
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Banana");
		ll2.add("Grapes");
		
		ll.addAll(ll2);
		System.out.println("After invoking addAll(Collection? extends E c>method :"+ll);
		
		LinkedList<String> ll3=new LinkedList<String>();
		ll3.add("Custurdapple");
		ll3.add("Blueberry");
		
		ll.addAll(1,ll3);
		System.out.println("After invoking addAll(int index, Collection<? extends E c>)method :"+ll);
		
		ll.addFirst("Orange");
		System.out.println("After invoking addFirst( E e) method :"+ll);
		
		ll.addLast("Strawberry");
		System.out.println("After invoking addLast(E e ) method:"+ll);
	}

}
