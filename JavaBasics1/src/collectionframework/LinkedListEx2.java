package collectionframework;
import java.util.*;
public class LinkedListEx2
{
	public static void main(String[] args) 
	{
      LinkedList<String> al=new LinkedList<String>();
      
      System.out.println("Initial list of elements:"+al);
      
		al.add("Mango");
		al.add("Grapes");
		al.add("Apple");
		al.add("Watermelon");
		System.out.println("After invoking add(E e)method :"+al);
		al.add(1, "Kiwi");
		System.out.println("After invoking add(int index, E element) method:"+al);
		
		LinkedList<String> al2=new LinkedList<String>();
		al2.add("Blueberry");
		al2.add("Orange");
		
		al.addAll(al2);
		System.out.println("After invoking addAll(Collection<?extends E>c) method :"+al);
		
		LinkedList<String> al3=new LinkedList<String>();
		al3.add("Pineapple");
		al3.add("Strawberry");
		
		al.addAll(1,al3);
		System.out.println("After invoking addAll(int index,Collection<? extends E>c) method :"+al);
		
		al.addFirst("Banana");
		System.out.println("After invoking addFirst(E e)method :"+al);
		
		al.addLast("Papaya");
		System.out.println("After invoking addLast(E e)method :"+al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
