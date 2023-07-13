package CollectionFramework;

import java.util.*;

public class LinkedListExample2 
{
	public static void main(String[] args) 
	{
	 LinkedList<String> al=new LinkedList<String>();
	 
	 System.out.println("Initial list of elements :");
	 
	 al.add("Tom");
	 al.add("John");
	 al.add("Mike");
	 
	 System.out.println("After invoking add(E e) method :"+al);
	 
	 LinkedList<String> al2=new LinkedList<String>();
	 
	 al2.add("Divya");
	 al2.add("Durga");
	 
	 al.addAll(al2);
	 
	 System.out.println("After invoking addAll(Collection<? extends E> c method :"+al);
	 
	 LinkedList<String> al3=new LinkedList<String>();
	 
	 al3.add("Sai");
	 al3.add("Hemant");
	 
	 al.addAll(1, al3);
	 
	 System.out.println("After invoking addAll(int index,Collection<? extends E>)c method:"+al);
	 
	 al.addFirst("Bhavani");
	 System.out.println("After invoking addFirst(E e) method :"+al);
	 
	 al.addLast("Geetha");
	 
	 System.out.println("After invoking addLast(E e) method :"+al);
	}

}
